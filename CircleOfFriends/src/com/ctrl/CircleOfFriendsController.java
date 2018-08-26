package com.ctrl;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sun.misc.BASE64Decoder;

import com.entity.CircleOfFriends;
import com.entity.Comm;
import com.service.CircleOfFriendsService;

@Controller
@RequestMapping("/circle")
public class CircleOfFriendsController {

	@Autowired
	private CircleOfFriendsService circleOfFriendsService;
	private Integer cfriendsId;

	// 查询所有的朋友圈
	@RequestMapping("/findAllCircleof.do")
	public @ResponseBody Comm<CircleOfFriends> findAllCircleof(HttpServletRequest request) {
		List<CircleOfFriends> findAllCircleof = circleOfFriendsService
				.findAllCircleof();
		
		for (CircleOfFriends circleOfFriends : findAllCircleof) {
//			bmpShow();
			circleOfFriends.setCircleImgs(""+circleOfFriends.getCircleImgs());
		}

		Comm<CircleOfFriends> circleComm = new Comm<CircleOfFriends>();
		
		if (findAllCircleof != null) {
			circleComm.setCode(100);
			circleComm.setMsg("处理成功");
			circleComm.setExtendList(findAllCircleof);
		}
		
		

		return circleComm;
	}

	// 发表动态
		@RequestMapping("/uploadImage.do")
		public @ResponseBody Comm<CircleOfFriends> uploadImage(String[] base64List,
				CircleOfFriends cir, HttpServletRequest request) {


			String circleBase64 = cir.getCircleBase64();
			String substring = circleBase64.substring(2, circleBase64.length() - 2);
			String replace = substring.replace("data:image/jpeg;base64,", "");
			String replace2 = replace.replace("\"", "");
			String[] split = replace2.split(",");

			StringBuffer base64SB = new StringBuffer();
			StringBuffer pathSB = new StringBuffer();
			String base64 = null;

			try {

				for (int j = 0; j < split.length; j++) {
					base64 = split[j];
					base64SB.append(split[j] + ",");
					BASE64Decoder decoder = new BASE64Decoder();

					byte[] b = decoder.decodeBuffer(base64);
					for (int i = 0; i < b.length; ++i) {
						if (b[i] < 0) {// 调整异常数据
							b[i] += 256;
						}
					}

					String imgFilePath = new Date().getTime() + ".jpg";
					String reimgFilePath = request.getSession().getServletContext()
							.getRealPath("/uploadImgs/" + imgFilePath);
					OutputStream out = new FileOutputStream(reimgFilePath);
					out.write(b);
					out.flush();
					out.close();
					imgFilePath = reimgFilePath.substring(reimgFilePath
							.lastIndexOf("\\") - 11);

					pathSB.append(imgFilePath + ",");

					cir.setCircleBase64(base64SB.toString().substring(0,
							base64SB.toString().length() - 1));
					cir.setCircleImgs(pathSB.toString().substring(0,
							pathSB.toString().length() - 1));

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Comm<CircleOfFriends> circleComm = new Comm<CircleOfFriends>();

			Integer uploadImage = circleOfFriendsService.uploadImage(base64, cir);
			if (uploadImage > 0) {
				circleComm.setCode(100);
				circleComm.setMsg("处理成功");
			}

			return circleComm;
		}


	// 转发动态
	@RequestMapping("/transmit.do")
	public @ResponseBody Comm<CircleOfFriends> transmit(CircleOfFriends cir){
		
		Comm<CircleOfFriends> circleComm = new Comm<CircleOfFriends>();
		List<CircleOfFriends> old = circleOfFriendsService.selectById(cir);
		if (old != null) {
			circleComm.setCode(100);
			circleComm.setMsg("处理成功");
			circleComm.setExtendList(old);
		}
		
		return circleComm;
		
	}
	
	
	@RequestMapping("/delete.do")
	public @ResponseBody Comm<CircleOfFriends> delete(Integer id){
		Comm<CircleOfFriends> circleComm = new Comm<CircleOfFriends>();
		
		Integer delete = circleOfFriendsService.delete(id);
		
		if (delete > 0) {
			circleComm.setCode(100);
			circleComm.setMsg("处理成功");
		}
		
		return circleComm;
	}

}


// 下载
//File filePic = new File(request.getSession().getServletContext().getRealPath("/uploadImgs/")+path);
//if(filePic.exists()){
//  
//	try {
//	   FileInputStream is = new FileInputStream(filePic);
//	   int i;
//	   i = is.available();
//		// 得到文件大小  
//	   byte data[] = new byte[i];  
//	   is.read(data); // 读数据  
//	   is.close();  
//	   response.setContentType("image/*"); // 设置返回的文件类型  
//	   OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象  
////	   toClient.write(data); // 输出数据  
//	   toClient.close();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}   
//}

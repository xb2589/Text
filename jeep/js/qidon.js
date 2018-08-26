(function () {
  //计算rem的
    function reCalcRem() {
      var $html = document.documentElement;
      $html.style.fontSize = ($html.getBoundingClientRect().width / 750) * 100+ "px";
    }
    window.addEventListener('resize', reCalcRem, false);
    reCalcRem(); 
    
    //启动音乐
    function play2() {
      var audio = document.createElement('audio');
      var source = document.createElement('source');

      source.type = "audio/mpeg";
      // source.src = "http://39.107.109.20:8080/jeep/audio/1-启动汽车副本.mp3";
      source.src = "audio/1-启动汽车副本.mp3";
      source.autoplay = "autoplay";
      source.controls = "controls";
      audio.appendChild(source);
      if(audio.paused){
          audio.play();
          audio.loop = false;
          audio.addEventListener('ended', function () {  
              str();
          }, false);
      }else{
          audio.pause();
      }
    }
    //汽车移动和渐变
    function str(){
        //轻快音乐
        var audio = document.createElement('audio');
        var source = document.createElement('source');

        source.type = "audio/mpeg";
        source.src = "audio/小车背景音乐.mp3";
        source.autoplay = "autoplay";
        source.controls = "controls";
        audio.appendChild(source);
        audio.play();
        var tiems=0;
        var n=1;
        //获取屏幕宽高
        var _width=document.body.scrollWidth;
        var _height=document.body.scrollHeight;
          sst=setInterval(function(){
              bj.style.backgroundPosition=--n+"px";
              tiems+=1;
              if(_width<=600){
                setTimeout(function () {
                  tm();
                },8000);
              }else if (_width<=700){
                setTimeout(function () {
                  tm();  
                },9000);
              }else {
                setTimeout(function () {
                  tm();  
                },10000);
              }
              function tm(){
                audio.pause();
                clearInterval(sst);
                $("#bj").fadeOut(3000);
                $("#jb").fadeIn(3000,function(){
                  var audio = document.createElement('audio');
                  var source = document.createElement('source');

                  source.type = "audio/mpeg";
                  source.src = "audio/4-大气背景音乐-4.mp3";
                  source.autoplay = "autoplay";
                  source.controls = "controls";
                  audio.appendChild(source);
                  
                  $(".se1").fadeIn(3000,function(){
                    $(".se22").fadeIn(2000);
                      $(".se2").fadeIn(2000,function(){
                        $(".se32").fadeIn(2000);
                          $(".se3").fadeIn(2000,function(){
                            $(".se34").fadeIn(1000,function(){
                                setTimeout(function () { 
                                   window.location.href="3.html";
                                },2000);
                            });
                           });
                      });
                  });
                });
              }
          },-100);
    }
    //点击事件
    $(".qd").click(function(){
        play2();
        $(this).attr("style","display:none");
    });
    var basePath = "";
    var loader = new WxMoment.Loader();
    //声明资源文件列表
    var fileList = [
      "images/buying/11.png",
      "images/buying/22.png",
      "images/buying/33.png",
      "images/zhiyin/1.jpg",
      "images/zhiyin/jb3.png",
      "images/zhiyin/阅读灯-天窗控制bj.jpg",
    ];
    for (var i = 0; i < fileList.length; i++) {
       loader.addImage(basePath + fileList[i]);
    }
    //加载完成
    // loader.addCompletionListener(function () {
    //    //可以在这里隐藏 Loading 页面开始进入主内容页面
    // //console.log("加载完成");
    //     setTimeout(function(){
    //     // window.location.href="2.html"; 
    //     // $(".loading_img").hide();
    //    //     $(".loading").addClass("hide");
    //   },2000);
    // })
    //启动加载
    loader.start(); 
    })();
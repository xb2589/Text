$(function(){ 
  //计算rem的
    function reCalcRem() {
      var $html = document.documentElement;
      $html.style.fontSize = ($html.getBoundingClientRect().width / 750) * 100+ "px";
    }
    window.addEventListener('resize', reCalcRem, false);
    reCalcRem();  

      var i=0; 
      var timer=null; 
      var firstimg=$('.img li').first().clone(); //复制第一张图片 
      $('.img').append(firstimg).width($('.img li').length*($('.img img').width())); //将第一张图片放到最后一张图片后，设置ul的宽度为图片张数*图片宽度 
      //判断左右滑动切换 
          $('.img').on("touchstart", function(e) { 
      //e.preventDefault(); 
          startX = e.originalEvent.changedTouches[0].pageX; 
      //e.stopPropagation(); 
          return false; 
          });
          /*向左按钮*/
           $(".banner .right").click(function(){
               clearInterval(timer); 
                i--; 
                if (i==-1) { 
                  i=$('.img li').length-2; 
                  $('.img').css({left:-($('.img li').length-1)*$('.img img').width()}); 
                } 
                $('.img').stop().animate({left:-i*$('.img img').width()},500); 
                $('.num li').eq(i).addClass('active').siblings().removeClass('active');     
           })
           /*向右按钮*/
           $(".banner .left").click(function(){
               clearInterval(timer); 
                i++; 
                if (i==$('.img li').length) { 
                  i=1; //这里不是i=0 
                  $('.img').css({left:0}); //保证无缝轮播，设置left值 
                }; 
             
                $('.img').stop().animate({left:-i*$('.img img').width()},500); 
                if (i==$('.img li').length-1) {   //设置小圆点指示 
                  $('.num li').eq(0).addClass('active').siblings().removeClass('active'); 
                }else{ 
                  $('.num li').eq(i).addClass('active').siblings().removeClass('active'); 
                } 
           }) 
      function resize() {
        var body = document.getElementsByTagName('body')[0];
        var html = document.getElementsByTagName('html')[0];
        var width = html.clientWidth;
        var height =  html.clientHeight;
        var max = width > height ? width : height;
        var min = width > height ? height : width;
        body.style.width = max + "px";
        body.style.height = min + "px";
      }
      resize();
      window.addEventListener("resize", resize)                                    
    }) 
(function(){
	//计算rem的
	function reCalcRem() {
	  var $html = document.documentElement;
	  $html.style.fontSize = ($html.getBoundingClientRect().width / 750) * 100+ "px";
	}
	window.addEventListener('resize', reCalcRem, false);
	    reCalcRem(); 
})();
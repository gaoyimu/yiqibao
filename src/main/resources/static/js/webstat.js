(function(){
/*	// 定义一个浏览器判断变量
		var browser={};
	// 判断是否是ie浏览器
	browser.ie = /msie (\d+\.\d+)/i.test(navigator.userAgent);
	// 浏览器cookie禁用与否
	browser.cookieEnabled = navigator.cookieEnabled;

*/

	// 定义一个统计数据的对象
	var stat={};
	// 用户访问url
	stat.url = encodeURIComponent(window.location.href);
	// 访问来源url
 	getCookie("stat_referer") ? getCookie("stat_referer") :setCookie("stat_referer",encodeURIComponent(document.referrer),"","/");
 	// 上一个url 
 	var previousUrl = document.referrer? encodeURIComponent(document.referrer):"";
 	setCookie("previousUrl",previousUrl,'','/');
 	//语言
 	stat.language = navigator.language || navigator.browserLanguage || navigator.systemLanguage || navigator.userLanguage || "";
 	stat.screen = (window.screen.width || 0) + "x" + (window.screen.height || 0);
 	// 判断是否第一次登陆 如果 stat.webstat_is_first 为 0 设置 cookie  
 	stat.webstat_is_first = getCookie("webstat_is_first")!=="0" ? "1" : "0";	
 	stat.webstat_is_first!=="0" && setCookie("webstat_is_first","0",24*3600*365,'/');
 	//setCookie("statjson",JSON.stringify(stat),"",'/');
	setCookie("statjson","",-1,'/');
 	// 判断是否第一次登陆  
 	 
	// 获取cookie值
	function getCookie(name){
		return (name = RegExp("(^| )" + name + "=([^;]*)(;|$)").exec(document.cookie)) ? name[2] : null;
	}
	// 设置cookie
	function setCookie(key,val,data,path){
		// 如果存在先删除
	//	getCookie(key) || delCookie(key);
		var d = new Date;
		data && ( d.setTime(d.getTime() + data));
		document.cookie = key + "="+ val + (data ? ";expires=" + d.toGMTString():"")+(path ? ";path=" + path:"");
	}
	// 删除cookie 
	function delCookie(key){
		var d = new Date;
		d.setTime(d.getTime() -1000);
		document.cookie = key + "="+ "" + ";expires=" + d.toGMTString()+";path=/" ;
	}
	// 获取随机数
	function getRandomNum(max){
		var rand ='';
		for(var i=0;i<max;i++){
			rand +=Math.floor(Math.random()*10);
		}
		return rand;
	}
	console.log(document);
	var img=new Image();  
	var randNum = getRandomNum(4); 
    img.src=basePath+"webstats/visitors?random="+randNum; 
	window.onbeforeunload=function(){
};
	//$(window).bind('beforeunload',function(){ 
	//									   	
	//	alert('sdfswdf');
	//	var showtime=new Image();  
	//    showtime.src=basePath+"webstats/showtime?random="+randNum; 
		
	//});


})();


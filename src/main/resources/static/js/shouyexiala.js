$(function(){
	var margin='';
    var aList='';
	var aList_W='';
	// var winWidth = $(".ct-frontpage-header").width()

	//  var winLeft=$('.home-search .one_List').offset().left
	// var logo_offLeft=$("#tyyjslogo").offset().left
	//  $(".index-list").css("width",winWidth+'px')
	//  $(".home-search .index-list").css("left",-winLeft+'px')
	// $(".index-list").css("padding",'45px '+logo_offLeft+'px')
	// $(".index-list-p").css("left",logo_offLeft+'px')
	$(".porduct-all .one_List").hover(function() {
	  $(".porduct-all .index-list").show()
	  var winWidth =  document.documentElement.clientWidth;
	  $("#yunjisuan").addClass('nav-hover')
	  margin=30 //设置间距
	  aList=$(".porduct-all .ul_block") //区块名称
	  aList_W=aList[0].offsetWidth+margin //区块实际宽度
	  waterfal()

	  $(".index-list").css("width",winWidth+'px')
	  var winLeft=$('.porduct-all .one_List').offset().left
	  $(".porduct-all .index-list").css("left",-winLeft+'px')
	  console.log(winWidth)
	}, function() {
	  $(".porduct-all .index-list").hide()
	  $("#yunjisuan").removeClass('nav-hover')
	});
	$(".home-search .one_List").hover(function() {
	  $(".home-search .index-list").show()
	  $("#yunjisuan").addClass('nav-hover')
	  margin=30 //设置间距
	  aList=$(".ul_block") //区块名称
	  aList_W=aList[0].offsetWidth+margin //区块实际宽度
	  waterfal()
	  var winWidth =  document.documentElement.clientWidth;
	  $(".index-list").css("width",winWidth+'px')
	    var winLeft=$('.home-search .one_List').offset().left
	    $(".home-search .index-list").css("left",-winLeft+'px')
	    console.log(winWidth)
		console.log(winLeft)
	}, function() {
	  $(".home-search .index-list").hide()
	  $("#yunjisuan").removeClass('nav-hover')
	});
		$("#solution").hover(function(){
		$(".sol_select").show()
		var winWidth =  document.documentElement.clientWidth;
		$(".sol_select").css("width",winWidth+'px')
		var winLeft=$("#solution").offset().left
		console.log(winWidth)
		console.log(winLeft)
	    $(".sol_select").css("left",-winLeft+'px')
	    $(this).children("a").addClass('nav-hover')
	},function(){
		$(".sol_select").hide()
		$(this).children("a").removeClass('nav-hover')
	});
		$("#number").hover(function(){
		$(".sol_select1").show()
		var winWidth =  document.documentElement.clientWidth;
		$(".sol_select1").css("width",winWidth+'px')
		var winLeft=$("#number").offset().left;
		console.log(winWidth)
		console.log(winLeft)
	    $(".sol_select1").css("left",-winLeft+'px')
	    $(this).children("a").addClass('nav-hover')
	},function(){
		$(".sol_select1").hide()
		$(this).children("a").removeClass('nav-hover')
	});
		$("#node").hover(function(){
		$(".sol_select2").show()
		var winWidth =  document.documentElement.clientWidth;
		$(".sol_select2").css("width",winWidth+'px')
		var winLeft=$("#node").offset().left;
		console.log(winWidth)
		console.log(winLeft)
	    $(".sol_select2").css("left",-winLeft+'px')
	    $(this).children("a").addClass('nav-hover')
	},function(){
		$(".sol_select2").hide()
		$(this).children("a").removeClass('nav-hover')
	})

	function waterfal(){
		var h=[] //记录区块高度的数组
		var n = 1300/aList_W|0;
		for(var i=0;i<aList.length;i++){
			aList_H=aList[i].offsetHeight;//获取每个的高度
			if(i < n) {//n是一行最多的li，所以小于n就是第一行了
				max_H =Math.max.apply(null,h);
				h[i]=aList_H;//把每个li放到数组里面
				aList.eq(i).css("top",0);//第一行的Li的top值为0
				aList.eq(i).css("left",i * aList_W);//第i个li的左坐标就是i*li的宽度
			}else{
				min_H =Math.min.apply(null,h) ;//取得数组中的最小值，区块中高度值最小的那个
				minKey = getarraykey(h, min_H);//最小的值对应的指针
				h[minKey] += aList_H+margin ;//加上新高度后更新高度值
				aList.eq(i).css("top",min_H+margin);//先得到高度最小的Li，然后把接下来的li放到它的下面
				aList.eq(i).css("left",minKey * aList_W); //第i个li的左坐标就是i*li的宽度
			}
		}
		max =Math.max.apply(null,h) ;
		$(".cont-ul").css("height",max);
	}
	/* 使用for in运算返回数组中某一值的对应项数(比如算出最小的高度值是数组里面的第几个) */
	function getarraykey(s, v) {for(k in s) {if(s[k] == v) {return k;}}}
	/*这里一定要用onload，因为不加载完就不知道高度值*/
	window.onload = function() {waterfal();};
	window.onresize = function() {waterfal();};
	waterfal();
});

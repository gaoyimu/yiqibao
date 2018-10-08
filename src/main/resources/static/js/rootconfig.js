/**
 * Created by dongdong on 15/2/6.
 */
seajs.config({
  base: basePath+'static/js',
  alias: {
    "jquery": "assets/jquery/dist/jquery.min.js",//因为以前的版本有修改，所以新增的东西就不建议使用此版本了
    "jquery2": "vendors/jquery.js",    //建议2015年9月23日以后，新增需要使用jquery的地方全部使用此版本
	"cookie": 'assets/jquery/src/cookie',
    "bootstrap": "assets/bootstrap/bootstrap/js/bootstrap",
    "fullPage": "assets/fullpage.js/jquery.fullPage.js",  //bigdata等用到
    "snabbt": "assets/snabbt.js/snabbt.js", //big data 等用到,使用snabbt.js插件必须同步使用 parallax 插件
    "select2": "assets/select2/select2.js", //buy等用到
    "parallax": "assets/parallax/deploy/jquery.parallax.js", //big data用到,使用snabbt.js插件必须同步使用该插件。
    "greensock": "assets/greensock/src/uncompressed/TweenMax.js", //只有/cooperation这个页面引用, 好像是只声明, 没实际用到
    "bootstrap-modal": "vendors/bootstrap-modal.js",
    "utils": "vendors/utils.js", //vmcontrol, networkinfo 等多处用到
    "bootbox": "vendors/bootbox.js", //替代modal 负载均衡等多出用到
    "underscore": "vendors/underscore.js?v=1",
	"highcharts": "highcharts/highcharts.js",
	"chartkick": "highcharts/chartkick",
    "jquery-ui": "vendors/jquery-ui.js",
    "login": "vendors/login.js?1",
    "bootstrap-modalmanager": "vendors/bootstrap-modalmanager.js", //多处引用
    "area": "vendors/area.js", //login 等多处使用 地区级联菜单
    "rAF": "rAF.js", //只有/cooperation这个页面引用, 好像是只声明, 没实际用到
    "moment": "assets/moment/min/moment-with-locales.js", //只有\ad\tuijian.php用到
    "datetimepicker": "assets/smalot-bootstrap-datetimepicker/js/bootstrap-datetimepicker.js",
    "easyAccordion": "vendors/jquery.easyAccordion.js", //index等用到
    "slick": "vendors/slick-carousel/slick/slick.js", //ad\credible_cloud.php用到
    "typedarray": "vendors/typedarray.js",
    "ajaxfileupload": "vendors/ajaxfileupload",

    "bootstrap-slider":"vendors/bootstrap-slider.js",
    "jquery-raty":"assets/raty/lib/jquery.raty.js", //评分插件, 多处用到

    "dataPicker":"jquery.date_input.pack.js", //时间日历插件

    'echarts': 'assets/echarts/echarts-plain-original-map' ,//华为云整合用户中心里面的消费用到echarts
    //"buynewVersion":"buynewVersion.js" //找不到这个文件
    'perfect-scrollbar':'perfect-scrollbar.with-mousewheel.min.js',

  }
});

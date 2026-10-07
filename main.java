<!DOCTYPE html>

<html  dir="ltr" lang="lv" xml:lang="lv">
<head>
    <title>DE0915(1),26/27-R: Programmas sagatave - Main.java | E-studiju vide</title>
    <link rel="shortcut icon" href="https://estudijas.rtu.lv/theme/image.php/lambda2/theme/1790921959/favicon" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="moodle, DE0915(1),26/27-R: Programmas sagatave - Main.java | E-studiju vide" />
<link rel="stylesheet" type="text/css" href="https://estudijas.rtu.lv/theme/yui_combo.php?rollup/3.18.1/yui-moodlesimple-min.css" /><script id="firstthemesheet" type="text/css">/** Required in order to fix style inclusion problems in IE with YUI **/</script><link rel="stylesheet" type="text/css" href="https://estudijas.rtu.lv/theme/styles.php/lambda2/1790921959_1/all" />
<script>
//<![CDATA[
var M = {}; M.yui = {};
M.pageloadstarttime = new Date();
M.cfg = {"wwwroot":"https:\/\/estudijas.rtu.lv","apibase":"https:\/\/estudijas.rtu.lv\/r.php\/api","homeurl":{},"sesskey":"EezEUKYtM9","sessiontimeout":"10800","sessiontimeoutwarning":1200,"themerev":"1790921959","slasharguments":1,"theme":"lambda2","iconsystemmodule":"core\/icon_system_fontawesome","jsrev":"1790921959","admin":"admin","svgicons":true,"usertimezone":"Eiropa\/R\u012bga","language":"lv","courseId":1039786,"courseContextId":9461938,"contextid":9938548,"contextInstanceId":6839073,"langrev":1791249603,"templaterev":"1790921959","siteId":1,"userId":1910338,"deprecationignorelist":[],"traceId":null};var yui1ConfigFn = function(me) {if(/-skin|reset|fonts|grids|base/.test(me.name)){me.type='css';me.path=me.path.replace(/\.js/,'.css');me.path=me.path.replace(/\/yui2-skin/,'/assets/skins/sam/yui2-skin')}};
var yui2ConfigFn = function(me) {var parts=me.name.replace(/^moodle-/,'').split('-'),component=parts.shift(),module=parts[0],min='-min';if(/-(skin|core)$/.test(me.name)){parts.pop();me.type='css';min=''}
if(module){var filename=parts.join('-');me.path=component+'/'+module+'/'+filename+min+'.'+me.type}else{me.path=component+'/'+component+'.'+me.type}};
YUI_config = {"debug":false,"base":"https:\/\/estudijas.rtu.lv\/lib\/yuilib\/3.18.1\/","comboBase":"https:\/\/estudijas.rtu.lv\/theme\/yui_combo.php?","combine":true,"filter":null,"insertBefore":"firstthemesheet","groups":{"yui2":{"base":"https:\/\/estudijas.rtu.lv\/lib\/yuilib\/2in3\/2.9.0\/build\/","comboBase":"https:\/\/estudijas.rtu.lv\/theme\/yui_combo.php?","combine":true,"ext":false,"root":"2in3\/2.9.0\/build\/","patterns":{"yui2-":{"group":"yui2","configFn":yui1ConfigFn}}},"moodle":{"name":"moodle","base":"https:\/\/estudijas.rtu.lv\/theme\/yui_combo.php?m\/1790921959\/","combine":true,"comboBase":"https:\/\/estudijas.rtu.lv\/theme\/yui_combo.php?","ext":false,"root":"m\/1790921959\/","patterns":{"moodle-":{"group":"moodle","configFn":yui2ConfigFn}},"filter":null,"modules":{"moodle-core-actionmenu":{"requires":["base","event","node-event-simulate"]},"moodle-core-chooserdialogue":{"requires":["base","panel","moodle-core-notification"]},"moodle-core-maintenancemodetimer":{"requires":["base","node"]},"moodle-core-lockscroll":{"requires":["plugin","base-build"]},"moodle-core-notification":{"requires":["moodle-core-notification-dialogue","moodle-core-notification-alert","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]},"moodle-core-notification-dialogue":{"requires":["base","node","panel","escape","event-key","dd-plugin","moodle-core-widget-focusafterclose","moodle-core-lockscroll"]},"moodle-core-notification-alert":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-notification-exception":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-notification-ajaxexception":{"requires":["moodle-core-notification-dialogue"]},"moodle-core-dragdrop":{"requires":["base","node","io","dom","dd","event-key","event-focus","moodle-core-notification"]},"moodle-core-event":{"requires":["event-custom"]},"moodle-core-blocks":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification"]},"moodle-core-handlebars":{"condition":{"trigger":"handlebars","when":"after"}},"moodle-core_availability-form":{"requires":["base","node","event","event-delegate","panel","moodle-core-notification-dialogue","json"]},"moodle-course-categoryexpander":{"requires":["node","event-key"]},"moodle-course-management":{"requires":["base","node","io-base","moodle-core-notification-exception","json-parse","dd-constrain","dd-proxy","dd-drop","dd-delegate","node-event-delegate"]},"moodle-course-dragdrop":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification","moodle-course-coursebase","moodle-course-util"]},"moodle-course-util":{"requires":["node"],"use":["moodle-course-util-base"],"submodules":{"moodle-course-util-base":{},"moodle-course-util-section":{"requires":["node","moodle-course-util-base"]},"moodle-course-util-cm":{"requires":["node","moodle-course-util-base"]}}},"moodle-form-dateselector":{"requires":["base","node","overlay","calendar"]},"moodle-form-shortforms":{"requires":["node","base","selector-css3","moodle-core-event"]},"moodle-question-searchform":{"requires":["base","node"]},"moodle-availability_completion-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_date-form":{"requires":["base","node","event","io","moodle-core_availability-form"]},"moodle-availability_grade-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_group-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_grouping-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-availability_profile-form":{"requires":["base","node","event","moodle-core_availability-form"]},"moodle-mod_assign-history":{"requires":["node","transition"]},"moodle-mod_attendance-groupfilter":{"requires":["base","node"]},"moodle-mod_quiz-quizbase":{"requires":["base","node"]},"moodle-mod_quiz-toolboxes":{"requires":["base","node","event","event-key","io","moodle-mod_quiz-quizbase","moodle-mod_quiz-util-slot","moodle-core-notification-ajaxexception"]},"moodle-mod_quiz-questionchooser":{"requires":["moodle-core-chooserdialogue","moodle-mod_quiz-util","querystring-parse"]},"moodle-mod_quiz-modform":{"requires":["base","node","event"]},"moodle-mod_quiz-autosave":{"requires":["base","node","event","event-valuechange","node-event-delegate","io-form","datatype-date-format"]},"moodle-mod_quiz-dragdrop":{"requires":["base","node","io","dom","dd","dd-scroll","moodle-core-dragdrop","moodle-core-notification","moodle-mod_quiz-quizbase","moodle-mod_quiz-util-base","moodle-mod_quiz-util-page","moodle-mod_quiz-util-slot","moodle-course-util"]},"moodle-mod_quiz-util":{"requires":["node","moodle-core-actionmenu"],"use":["moodle-mod_quiz-util-base"],"submodules":{"moodle-mod_quiz-util-base":{},"moodle-mod_quiz-util-slot":{"requires":["node","moodle-mod_quiz-util-base"]},"moodle-mod_quiz-util-page":{"requires":["node","moodle-mod_quiz-util-base"]}}},"moodle-mod_scheduler-delselected":{"requires":["base","node","event"]},"moodle-mod_scheduler-saveseen":{"requires":["base","node","event"]},"moodle-mod_scheduler-studentlist":{"requires":["base","node","event","io"]},"moodle-message_airnotifier-toolboxes":{"requires":["base","node","io"]},"moodle-report_eventlist-eventfilter":{"requires":["base","event","node","node-event-delegate","datatable","autocomplete","autocomplete-filters"]},"moodle-report_loglive-fetchlogs":{"requires":["base","event","node","io","node-event-delegate"]},"moodle-gradereport_history-userselector":{"requires":["escape","event-delegate","event-key","handlebars","io-base","json-parse","moodle-core-notification-dialogue"]},"moodle-qbank_editquestion-chooser":{"requires":["moodle-core-chooserdialogue"]},"moodle-tool_lp-dragdrop-reorder":{"requires":["moodle-core-dragdrop"]},"moodle-assignfeedback_editpdf-editor":{"requires":["base","event","node","io","graphics","json","event-move","event-resize","transition","querystring-stringify-simple","moodle-core-notification-dialog","moodle-core-notification-alert","moodle-core-notification-warning","moodle-core-notification-exception","moodle-core-notification-ajaxexception"]}}},"gallery":{"name":"gallery","base":"https:\/\/estudijas.rtu.lv\/lib\/yuilib\/gallery\/","combine":true,"comboBase":"https:\/\/estudijas.rtu.lv\/theme\/yui_combo.php?","ext":false,"root":"gallery\/1790921959\/","patterns":{"gallery-":{"group":"gallery"}}}},"modules":{"core_filepicker":{"name":"core_filepicker","fullpath":"https:\/\/estudijas.rtu.lv\/lib\/javascript.php\/1790921959\/repository\/filepicker.js","requires":["base","node","node-event-simulate","json","async-queue","io-base","io-upload-iframe","io-form","yui2-treeview","panel","cookie","datatable","datatable-sort","resize-plugin","dd-plugin","escape","moodle-core_filepicker","moodle-core-notification-dialogue"]},"core_comment":{"name":"core_comment","fullpath":"https:\/\/estudijas.rtu.lv\/lib\/javascript.php\/1790921959\/comment\/comment.js","requires":["base","io-base","node","json","yui2-animation","overlay","escape"]}},"logInclude":[],"logExclude":[],"logLevel":null};
M.yui.loader = {modules: {}};

//]]>
</script>
<script type="importmap">{
    "imports": {
        "@moodle/lms/": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/@moodle/lms/",
        "@moodlehq/design-system": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/@moodlehq/design-system",
        "react": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/react",
        "react/": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/react/",
        "react-dom": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/react-dom",
        "react-dom/": "https://estudijas.rtu.lv/r.php/core/esm/1790921959/react-dom/"
    }
}</script>
<link rel="shortcut icon" href="https://ortus.rtu.lv/favicon.ico" type="image/x-icon">

<style> @media (min-width: 980px){
.navbar #search input#coursesearchbox {
width: 256px !important;
}
}
</style>
	
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body  id="page-mod-resource-view" class="format-topics  path-mod path-mod-resource safari dir-ltr lang-lv yui-skin-sam yui3-skin-sam estudijas-rtu-lv pagelayout-incourse course-1039786 context-9938548 cmid-6839073 cm-type-resource category-10667 theme lambda m-52 layout-full blockstyle-01 page-header-style-01 header-style-0">
<div class="wrapper-lambda-outer">
<div class="toast-wrapper mx-auto py-0 fixed-top" role="status" aria-live="polite"></div>
<div id="page-wrapper-outer">

    <div>
    <a class="visually-hidden-focusable" href="#maincontent">Atvērt galveno saturu</a>
</div><script src="https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/polyfills/polyfill.js"></script>
<script src="https://estudijas.rtu.lv/theme/yui_combo.php?rollup/3.18.1/yui-moodlesimple-min.js"></script><script src="https://estudijas.rtu.lv/theme/jquery.php/core/jquery-3.7.1.min.js"></script>
<script src="https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/javascript-static.js"></script>
<script src="https://estudijas.rtu.lv/theme/javascript.php/lambda2/1790921959/head"></script>
<script type="module">import "@moodle/lms/core/react_autoinit";</script><script>
//<![CDATA[
document.body.className += ' jsenabled';
//]]>
</script>


<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-5942869-19"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-5942869-19');
</script>
    
        <div  class="drawer drawer-left  d-print-none not-initialized" data-region="fixed-drawer" id="theme_boost-drawers-courseindex" data-preference="drawer-open-index" data-state="show-drawer-left" data-forceopen="0" data-close-on-resize="0">
    <div class="drawerheader">
        <div class="drawerheading">
            
        </div>
        <div class="draweractions">
            <div class="drawerheadercontent">
                                <div id="courseindexdrawercontrols" class="dropdown">
                    <button class="btn btn-icon"
                            id="courseindexdrawercontrolsmenubutton"
                            type="button"
                            data-bs-toggle="dropdown"
                            aria-haspopup="true"
                            aria-expanded="false"
                            title="Course index options"
                            aria-label="Course index options"
                            aria-controls="courseindexdrawercontrolsmenu">
                        <i class="icon fa fa-angles-down fa-fw m-0" aria-hidden="true"></i>
                    </button>
                    <div class="dropdown-menu dropdown-menu-end" role="menu" id="courseindexdrawercontrolsmenu" aria-labelledby="courseindexdrawercontrolsmenubutton">
                        <a class="dropdown-item"
                           href="#"
                           data-action="expandallcourseindexsections"
                           role="menuitem"
                        >
                            <i class="icon fa fa-angles-down fa-fw " aria-hidden="true" ></i>
                            Izvērst visu
                        </a>
                        <a class="dropdown-item"
                           href="#"
                           data-action="collapseallcourseindexsections"
                           role="menuitem"
                        >
                            <span class="dir-rtl-hide"><i class="icon fa fa-angles-right fa-fw " aria-hidden="true" ></i></span>
                            <span class="dir-ltr-hide"><i class="icon fa fa-angles-left fa-fw " aria-hidden="true" ></i></span>
                            Sakļaut visu
                        </a>
                    </div>
                </div>

            </div>
            <button
                class="btn btn-icon icon-size-3 drawertoggle"
                data-toggler="drawers"
                data-action="closedrawer"
                data-target="theme_boost-drawers-courseindex"
                data-bs-toggle="tooltip"
                data-bs-placement="right"
                title="Aizvērt kursa indeksu"
                aria-label="Aizvērt kursa indeksu"
            >
                    <i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i>
            </button>
        </div>
    </div>
    <div class="drawercontent drag-container" data-usertour="scroller">
                        <nav id="courseindex" class="courseindex">
    <div id="courseindex-content">
        <div data-region="loading-placeholder-content" aria-hidden="true" id="course-index-placeholder">
            <ul class="placeholders list-unstyled px-5">
                <li>
                    <div class="col-md-6 p-0 d-flex align-items-center">
                        <div class="bg-pulse-grey rounded-circle me-2"></div>
                        <div class="bg-pulse-grey w-100"></div>
                    </div>
                </li>
                <li>
                    <div class="col-md-6 p-0 d-flex align-items-center">
                        <div class="bg-pulse-grey rounded-circle me-2"></div>
                        <div class="bg-pulse-grey w-100"></div>
                    </div>
                </li>
                <li>
                    <div class="col-md-6 p-0 d-flex align-items-center">
                        <div class="bg-pulse-grey rounded-circle me-2"></div>
                        <div class="bg-pulse-grey w-100"></div>
                    </div>
                </li>
                <li>
                    <div class="col-md-6 p-0 d-flex align-items-center">
                        <div class="bg-pulse-grey rounded-circle me-2"></div>
                        <div class="bg-pulse-grey w-100"></div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

    </div>
</div>

<div id="page" data-region="mainpage" data-usertour="scroller" class="drawers   drag-container">
<div id="page-top"></div>
<div class="wrapper-lambda">

	    
	    <header id="main-header" class="clearfix top style-0">
	    
	    	
	    	<div id="header-logo">
	    		<div class="row">
	    			<div class="col-md-6">
	    					<a href="https://estudijas.rtu.lv" class="logo"><img src="https://estudijas.rtu.lv/pluginfile.php/1/core_admin/logo/0x200/1790921959/Upscaled_Estudijas.png" alt="E-studiju vide"></a>
	    			</div>
	    			<div class="col-md-6 login-header">
	    				<div class="profileblock">
	    						<div class="popover-region collapsed popover-region-notifications"
    id="nav-notification-popover-container" data-userid="1910338"
    data-region="popover-region">
    <div class="popover-region-toggle nav-link icon-no-margin"
        data-region="popover-region-toggle"
        aria-controls="popover-region-container-6ac5f3c17d2e06ac5f3c1791d713"
        aria-haspopup="true"
        aria-expanded="false"
        aria-label="  Show notification window with 17 new notifications  "
        title="  Show notification window with 17 new notifications  "
        tabindex="0"
        role="button">
                <i class="icon fa fa-bell fa-fw " aria-hidden="true" ></i>
        <div
            class="count-container "
            data-region="count-container"
            aria-hidden=true
        >
            17
        </div>

    </div>
    <div         aria-modal="true"
        tabindex="-1"

        id="popover-region-container-6ac5f3c17d2e06ac5f3c1791d713"
        class="popover-region-container"
        data-region="popover-region-container"
        aria-hidden="true"
        aria-label="Paziņojumu logs"
        role="dialog">
        <div class="popover-region-header-container">
            <h3 class="popover-region-header-text" data-region="popover-region-header-text">Paziņojumi</h3>
            <div class="popover-region-header-actions" data-region="popover-region-header-actions">        <a class="mark-all-read-button btn btn-sm btn-link m-0 py-0 icon-no-margin"
           href="#"
           title="Atzīmēt visu kā izlasītu"
           data-action="mark-all-read"
           role="button"
           aria-label="Atzīmēt visu kā izlasītu">
            <span class="normal-icon"><i class="icon fa fa-check fa-fw " aria-hidden="true" ></i></span>
            <span class="loading-icon icon-no-margin ">
                <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
            </span>
            <span aria-live="polite" class="visually-hidden" data-region="notification-read-feedback"></span>
        </a>
            <a href="https://estudijas.rtu.lv/message/notificationpreferences.php"
               title="Paziņojumu iestatījumi"
               aria-label="Paziņojumu iestatījumi"
               class="btn btn-sm btn-link m-0 py-0 icon-no-margin" >
                <i class="icon fa fa-gear fa-fw " aria-hidden="true" ></i></a>
        <button type="button" class="btn btn-sm btn-link m-0 py-0 icon-no-margin" aria-label="Aizvērt" title="Aizvērt" data-action="close-notification-popover">
            <i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i>
        </button>
</div>
        </div>
        <div class="popover-region-content-container" data-region="popover-region-content-container">
            <div class="popover-region-content" data-region="popover-region-content">
                        <div class="all-notifications"
            data-region="all-notifications"
            role="log"
            aria-busy="false"
            aria-atomic="false"
            aria-relevant="additions"></div>
        <div class="empty-message" tabindex="0" data-region="empty-message">Jums nav paziņojumu</div>

            </div>
            <span class="loading-icon icon-no-margin ">
                <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
            </span>
        </div>
                <a class="see-all-link"
                    href="https://estudijas.rtu.lv/message/output/popup/notifications.php">
                    <div class="popover-region-footer-container">
                        <div class="popover-region-seeall-text">Skatīt visu</div>
                    </div>
                </a>
    </div>
</div><div class="popover-region collapsed" data-region="popover-region-messages">
    <a
        id="message-drawer-toggle-6ac5f3c17dd646ac5f3c1791d714"
        class="nav-link popover-region-toggle position-relative icon-no-margin"
        href="#"
        aria-label="Pārslēgt ziņojumu logu"
        title="Pārslēgt ziņojumu logu"
        role="button"
        aria-expanded="false"
        aria-describedby="unread-messages-count-6ac5f3c17dd646ac5f3c1791d714"
    >
        <i class="icon fa fa-message fa-fw " aria-hidden="true" ></i>
        <div
            class="count-container "
            data-region="count-container"
        >
            <span aria-hidden="true">1</span>
            <span class="visually-hidden" id="unread-messages-count-6ac5f3c17dd646ac5f3c1791d714">Ir 1 nelasītas sarunas</span>
        </div>
    </a>
    <span class="visually-hidden-focusable" data-region="jumpto" tabindex="-1"></span>
</div>
	    						<div class="d-flex align-items-stretch usermenu-container" data-region="usermenu">
	                    				
	                    				<div class="usermenu">
	                    				        <div class="dropdown show">
	                    				            <a href="#" id="user-menu-toggle" data-bs-toggle="dropdown" aria-label="Lietotāja izvēlne"
	                    				               aria-haspopup="true" aria-controls="user-action-menu" class="dropdown-toggle">Marks Baufāls
	                    				                <span class="userbutton">
	                    				                    <span class="avatars">
	                    				                            <span class="avatar current">
	                    				                                <img src="https://files.rtu.lv/userphoto/w35/6EE58FF6-0C16-4DFD-87DE-BFB42A188A0F.jpg" class="userpicture defaultuserpic" width="35" alt="" />
	                    				                            </span>
	                    				                    </span>
	                    				                </span>
	                    				            </a>
	                    				            <div id="user-action-menu" class="dropdown-menu dropdown-menu-right">
	                    				                <div id="usermenu-carousel" class="carousel slide" data-touch="false" data-interval="false" data-keyboard="false">
	                    				                    <div class="carousel-inner">
	                    				                        <div id="carousel-item-main" class="carousel-item active" role="menu" tabindex="-1" aria-label="Lietotājs">
	                    				                                    <a href="https://estudijas.rtu.lv/user/profile.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Profils
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="https://estudijas.rtu.lv/grade/report/overview/index.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Vērtējumi
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="https://estudijas.rtu.lv/calendar/view.php?view=month" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Kalendārs
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="https://estudijas.rtu.lv/message/index.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Ziņas
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="https://estudijas.rtu.lv/user/files.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Privātie faili
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="https://estudijas.rtu.lv/reportbuilder/index.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Atskaites
	                    				                                    </a>
	                    				                                
	                    				                                <div class="dropdown-divider"></div>
	                    				                                    <a href="https://estudijas.rtu.lv/user/preferences.php" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Iestatījumi
	                    				                                    </a>
	                    				                                
	                    				                                    <a href="#" class="carousel-navigation-link dropdown-item" role="menuitem" tabindex="-1" data-carousel-target-id="carousel-item-6ac5f3c17b5a9">
	                    				                                            
	                    				                                        Valoda
	                    				                                    </a>
	                    				                                <div class="dropdown-divider"></div>
	                    				                                    <a href="https://estudijas.rtu.lv/login/logout.php?sesskey=EezEUKYtM9" class="dropdown-item" role="menuitem" tabindex="-1">
	                    				                                            
	                    				                                        Atslēgties
	                    				                                    </a>
	                    				                                
	                    				                        </div>
	                    				                            <div id="carousel-item-6ac5f3c17b5a9" class="carousel-item submenu" tabindex="-1" aria-label="Valodas izvēlne">
	                    				                                <div class="d-flex flex-column h-100">
	                    				                                    <div class="header">
	                    				                                        <button type="button" class="btn btn-icon carousel-navigation-link text-decoration-none text-body" data-carousel-target-id="carousel-item-main" aria-label="Doties atpakaļ uz lietotāja navigāciju">
	                    				                                            <span class="dir-rtl-hide"><img class="icon " alt="" aria-hidden="true" src="https://estudijas.rtu.lv/theme/image.php/lambda2/core/1790921959/i/arrow-left" /></span>
	                    				                                            <span class="dir-ltr-hide"><img class="icon " alt="" aria-hidden="true" src="https://estudijas.rtu.lv/theme/image.php/lambda2/core/1790921959/i/arrow-right" /></span>
	                    				                                        </button>
	                    				                                        <span class="ps-2" id="carousel-item-title-6ac5f3c17b5a9">Valodas izvēlne</span>
	                    				                                    </div>
	                    				                                    <div class="dropdown-divider"></div>
	                    				                                    <div class="items h-100 overflow-auto" role="menu" aria-labelledby="carousel-item-title-6ac5f3c17b5a9">
	                    				                                                <a href="https://estudijas.rtu.lv/mod/resource/view.php?id=6839073&amp;lang=en" class="dropdown-item ps-5" role="menuitem" tabindex="-1" 
	                    				                                                    lang="en" >
	                    				                                                    English ‎(en)‎
	                    				                                                </a>
	                    				                                                <a href="#" class="dropdown-item ps-5" role="menuitem" tabindex="-1" aria-current="true"
	                    				                                                    >
	                    				                                                    Latviešu ‎(lv)‎
	                    				                                                </a>
	                    				                                    </div>
	                    				                                </div>
	                    				                            </div>
	                    				                    </div>
	                    				                </div>
	                    				            </div>
	                    				        </div>
	                    				</div>
	            				</div>
	    						<a href="https://estudijas.rtu.lv/user/view.php?id=1910338&amp;course=1039786" class="d-inline-block aabtn"><img src="https://files.rtu.lv/userphoto/w100/6EE58FF6-0C16-4DFD-87DE-BFB42A188A0F.jpg" class="welcome_userpicture defaultuserpic" width="75" alt="Marks Baufāls" title="Marks Baufāls" /></a>
	    				</div>
	    			</div>
	    		</div>
	    	</div>
	    </header>
	    
	    <header class="lambda-nav style-0">
	            <nav class="navbar navbar-expand">
	    			<div class="menu">
	            		<nav class="moremenu navigation">
	            		    <ul id="moremenu-6ac5f3c17b0d0-navbar-nav" role="menubar" class="nav more-nav navbar-nav">
	            		                <li data-key="myhome" class="nav-item" role="none" data-forceintomoremenu="false">
	            		                            <a role="menuitem" class="nav-link  "
	            		                                href="https://estudijas.rtu.lv/my/"
	            		                                
	            		                                
	            		                                data-disableactive="true"
	            		                                tabindex="-1"
	            		                            >
	            		                                Infopanelis
	            		                            </a>
	            		                </li>
	            		                <li data-key="mycourses" class="nav-item" role="none" data-forceintomoremenu="false">
	            		                            <a role="menuitem" class="nav-link  "
	            		                                href="https://estudijas.rtu.lv/my/courses.php"
	            		                                
	            		                                
	            		                                data-disableactive="true"
	            		                                tabindex="-1"
	            		                            >
	            		                                Mani kursi
	            		                            </a>
	            		                </li>
	            		                <li data-key="" class="nav-item" role="none" data-forceintomoremenu="false">
	            		                            <a role="menuitem" class="nav-link  "
	            		                                href="https://estudijas.rtu.lv/my/index.php"
	            		                                
	            		                                
	            		                                data-disableactive="true"
	            		                                tabindex="-1"
	            		                            >
	            		                                Sākums
	            		                            </a>
	            		                </li>
	            		                <li data-key="" class="nav-item" role="none" data-forceintomoremenu="false">
	            		                            <a role="menuitem" class="nav-link  "
	            		                                href="https://atbalsts.rtu.lv/page/estudijas-atbalsta-materiali"
	            		                                
	            		                                
	            		                                data-disableactive="true"
	            		                                tabindex="-1"
	            		                            >
	            		                                Atbalsta materiāli
	            		                            </a>
	            		                </li>
	            		                <li class="dropdown nav-item" role="none" data-forceintomoremenu="false">
	            		                    <a class="dropdown-toggle nav-link  " id="drop-down-6ac5f3c17ae93" role="menuitem" data-bs-toggle="dropdown"
	            		                        aria-haspopup="true" aria-expanded="false" href="#" aria-controls="drop-down-menu-6ac5f3c17ae93"
	            		                        
	            		                        
	            		                        tabindex="-1"
	            		                    >
	            		                        Noderīgas saites
	            		                    </a>
	            		                    <div class="dropdown-menu" role="menu" id="drop-down-menu-6ac5f3c17ae93" aria-labelledby="drop-down-6ac5f3c17ae93">
	            		                                    <a class="dropdown-item" role="menuitem" href="https://ortus.rtu.lv/"target="_blank"  data-disableactive="true" tabindex="-1"
	            		                                        
	            		                                    >
	            		                                        ORTUS
	            		                                    </a>
	            		                                    <a class="dropdown-item" role="menuitem" href="https://nodarbibas.rtu.lv"  data-disableactive="true" tabindex="-1"
	            		                                        
	            		                                    >
	            		                                        Nodarbību grafiks
	            		                                    </a>
	            		                                    <a class="dropdown-item" role="menuitem" href="https://ndr.rtu.lv"  data-disableactive="true" tabindex="-1"
	            		                                        
	            		                                    >
	            		                                        Noslēguma darbu reģistrs
	            		                                    </a>
	            		                                    <a class="dropdown-item" role="menuitem" href="https://mans.rtu.lv"  data-disableactive="true" tabindex="-1"
	            		                                        
	            		                                    >
	            		                                        Studentu portāls
	            		                                    </a>
	            		                    </div>
	            		                </li>
	            		                <li class="dropdown nav-item" role="none" data-forceintomoremenu="false">
	            		                    <a class="dropdown-toggle nav-link  " id="drop-down-6ac5f3c17aee3" role="menuitem" data-bs-toggle="dropdown"
	            		                        aria-haspopup="true" aria-expanded="false" href="#" aria-controls="drop-down-menu-6ac5f3c17aee3"
	            		                        
	            		                        
	            		                        tabindex="-1"
	            		                    >
	            		                        Pieteikt problēmu
	            		                    </a>
	            		                    <div class="dropdown-menu" role="menu" id="drop-down-menu-6ac5f3c17aee3" aria-labelledby="drop-down-6ac5f3c17aee3">
	            		                                    <a class="dropdown-item" role="menuitem" href="https://atbalsts.rtu.lv/page/it-pieteikumi?createRequest=true&amp;portalId=3&amp;requestTypeId=2980"  data-disableactive="true" tabindex="-1"
	            		                                        title="lv"
	            		                                    >
	            		                                        E-studiju sistēmas problēma
	            		                                    </a>
	            		                                    <a class="dropdown-item" role="menuitem" href="https://atbalsts.rtu.lv/page/biezakie-pieteikumi?createRequest=true&amp;portalId=3&amp;requestTypeId=3013"  data-disableactive="true" tabindex="-1"
	            		                                        title="lv"
	            		                                    >
	            		                                        Auditoriju aprīkojuma problēma
	            		                                    </a>
	            		                                <div class="dropdown-divider"></div>
	            		                                    <a class="dropdown-item" role="menuitem" href="lv"  data-disableactive="true" tabindex="-1"
	            		                                        
	            		                                    >
	            		                                        RTU IT Pakalpojumu centra tel.nr.: 67089999
	            		                                    </a>
	            		                    </div>
	            		                </li>
	            		        <li role="none" class="nav-item dropdown dropdownmoremenu d-none" data-region="morebutton">
	            		            <a class="dropdown-toggle nav-link " href="#" id="moremenu-dropdown-6ac5f3c17b0d0" role="menuitem" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false" tabindex="-1">
	            		                Vairāk
	            		            </a>
	            		            <ul class="dropdown-menu dropdown-menu-start" data-region="moredropdown" aria-labelledby="moremenu-dropdown-6ac5f3c17b0d0" role="menu">
	            		            </ul>
	            		        </li>
	            		    </ul>
	            		</nav>
	    			</div>
	    			<div class="d-flex">
	    			
	    				<div class="search-margin"></div>
	    				<div class="lambda-search-bar">
	    					<form id="lambda-navbarsearch-form" autocomplete="off" method="get" action="https://estudijas.rtu.lv/course/search.php" >
							<div class="search-container">
								<i class="lambda icon-search1" aria-hidden="true"></i>
								<input id="navbarsearchbox" type="text" name="q" data-region="input" autocomplete="off" aria-label="Meklēt kursu" placeholder="Meklēt kursu">
								<label for="navbarsearchbox" class="lambda-sr-only">Meklēt kursu</label>
							</div>
						</form>
	    				</div>
	    			</div>
	            </nav>
	    </header>


    <div class="drawer-toggles d-flex">
            <div class="drawer-toggler drawer-left-toggle open-nav d-print-none">
                <button
                    class="btn icon-no-margin"
                    data-toggler="drawers"
                    data-action="toggle"
                    data-target="theme_boost-drawers-courseindex"
                    data-toggle="tooltip"
                    data-placement="right"
                    title="Atvērt kursu indeksu"
                >
                    <span class="sr-only">Atvērt kursu indeksu</span>
                    <i class="icon fa fa-list deprecated deprecated-core:t/index_drawer fa-fw " aria-hidden="true" ></i>
                </button>
            </div>
    </div>

        <div id="lambda-incourse-header">
            <header id="page-header" class="header-maxwidth d-print-none" data-for="page-heading">
    <div class="w-100">
        <div class="d-flex flex-wrap">
            <div id="page-navbar">
                <nav aria-label="Navigācijas josla">
    <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="https://estudijas.rtu.lv/course/view.php?id=1039786"
                        
                        title="Risinājumu algoritmizēšana un programmēšana(1),26/27-R"
                        
                    >
                        Risinājumu algoritmizēšana un programmēšana(1),26/27-R
                    </a>
                </li>
        
                <li class="breadcrumb-item">
                    <a href="https://estudijas.rtu.lv/course/section.php?id=3201193"
                        
                        
                        data-section-name-for="3201193" 
                    >
                        5. Lab. darbs: 5.10.2026. - 9.10.2026.
                    </a>
                </li>
        
                <li class="breadcrumb-item">
                    <span >
                        Programmas sagatave - Main.java
                    </span>
                </li>
        </ol>
</nav>
            </div>
            <div class="ms-auto d-flex">
                
            </div>
            <div id="course-header">
                
            </div>
        </div>
        <div class="d-flex align-items-center">
            <div class="me-auto d-flex flex-column">
                <div>
                    <div class="page-context-header d-flex flex-wrap align-items-center mb-2">
    <div class="page-header-image">
        <div class="content activityiconcontainer me-2 modicon_resource"><img class="icon activityicon " aria-hidden="true" src="https://estudijas.rtu.lv/theme/image.php/lambda2/core/1790921959/f/sourcecode?filtericon=1" alt="" /></div>
    </div>
    <div class="page-header-headings">
        <h1 class="h2 mb-0">Programmas sagatave - Main.java</h1>
    </div>
</div>
                </div>
                <div>
                </div>
            </div>
            <div class="header-actions-container ms-auto" data-region="header-actions-container">
            </div>
        </div>
        <div class="header-extras-container ms-auto" data-region="header-extras-container">
        </div>
    </div>
</header>
        </div>
    
    <div id="page-content" class="row ">
    
        <div id="region-main-box" class="col-xs-12 col-12 px-0">
            <section id="region-main" class="mx-15">

                <span class="notifications" id="user-notifications"></span>
                    <span id="maincontent"></span>
                        <h2>Programmas sagatave - Main.java</h2>
                    <div class="activity-header" data-for="page-activity-header">
                            <div data-region="activity-information" data-activityname="Programmas sagatave - Main.java" class="activity-information">
    <div data-region="activity-details" class="activity-details">
            <div class="activity-description" id="intro">
                <p class="resourcedetails">JAVA</p>
            </div>
    </div>
</div>
                        </div>
                <div role="main"><div class="resourceworkaround">Noklikšķiniet uz saites <a href="https://estudijas.rtu.lv/pluginfile.php/9938548/mod_resource/content/1/Main.java" onclick="window.open('https://estudijas.rtu.lv/pluginfile.php/9938548/mod_resource/content/1/Main.java', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false;">Main.java</a>, lai apskatītu failu.</div></div>
                    <div class="text-center mt-4 lambda-activity-nav" data-current-cmid="6839073"><a href="#" class="btn btn-outline-secondary me-2 btn-prev disabled" aria-disabled="true" role="button" title="">« Iepriekšējais</a><a class="btn btn-primary me-2 btn-back" href="https://estudijas.rtu.lv/course/view.php?id=1039786">Atpakaļ uz Kurss</a><a href="#" class="btn btn-outline-secondary btn-next disabled" aria-disabled="true" role="button" title="">Nākamais »</a></div>
                

            </section>
        </div>
    </div>


<a id="sticky-to-top" href="#page-top" uk-totop uk-scroll></a>
<footer id="page-footer" class="lambda-page-footer">
    
	
	
	<div class="footer-bottom">	
        <div class="container-fluid">
            <div id="course-footer" class="row">
                <div class="col-12">
                    

			            


		
                    <div class="logininfo">Jūs esat pieslēdzies kā <a href="https://estudijas.rtu.lv/user/profile.php?id=1910338">Marks Baufāls</a> (<a href="https://estudijas.rtu.lv/login/logout.php?sesskey=EezEUKYtM9">Atslēgties</a>)</div>
                    <div class="tool_usertours-resettourcontainer"></div>
        
                    
                    <script>
//<![CDATA[
var require = {
    baseUrl : 'https://estudijas.rtu.lv/lib/requirejs.php/1790921959/',
    // We only support AMD modules with an explicit define() statement.
    enforceDefine: true,
    skipDataMain: true,
    waitSeconds : 0,

    paths: {
        jquery: 'https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/jquery/jquery-3.7.1.min',
        jqueryui: 'https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/jquery/ui-1.14.1/jquery-ui.min',
        jqueryprivate: 'https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/requirejs/jquery-private'
    },

    // Custom jquery config map.
    map: {
      // '*' means all modules will get 'jqueryprivate'
      // for their 'jquery' dependency.
      '*': { jquery: 'jqueryprivate' },

      // 'jquery-private' wants the real jQuery module
      // though. If this line was not here, there would
      // be an unresolvable cyclic dependency.
      jqueryprivate: { jquery: 'jquery' }
    }
};

//]]>
</script>
<script src="https://estudijas.rtu.lv/lib/javascript.php/1790921959/lib/requirejs/require.min.js"></script>
<script>
//<![CDATA[
M.util.js_pending("core/first");
require(['core/first'], function() {
require(['core/prefetch'])
;
M.util.js_pending('filter_mathjaxloader/loader'); require(['filter_mathjaxloader/loader'], function(amd) {amd.configure({"mathjaxurl":"https:\/\/cdn.jsdelivr.net\/npm\/mathjax@4.0.0\/tex-mml-chtml.js","mathjaxconfig":"","lang":"en"}); M.util.js_complete('filter_mathjaxloader/loader');});;
require(["media_videojs/loader"], function(loader) {
    loader.setUp('lv');
});;
M.util.js_pending('core_courseformat/courseeditor'); require(['core_courseformat/courseeditor'], function(amd) {amd.setViewFormat("1039786", {"editing":false,"supportscomponents":true,"statekey":"1791356944_1791357889","overriddenStrings":[]}); M.util.js_complete('core_courseformat/courseeditor');});;

require(['core_courseformat/local/courseindex/placeholder'], function(component) {
    component.init('#course-index-placeholder');
});
;

require(['core_courseformat/local/courseindex/drawer'], function(component) {
    component.init('#courseindex');
});
;
function legacy_activity_onclick_handler_1(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839073&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_2(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839074&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_3(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839077&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_4(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839078&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_5(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839080&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_6(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839081&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_7(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839082&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_8(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839083&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_9(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6839084&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_10(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6853428&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_11(e) { e.halt(); window.open('https://estudijas.rtu.lv/mod/resource/view.php?id=6853429&redirect=1', '', 'width=800,height=600,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
M.util.js_pending('core_courseformat/local/content/activity_header'); require(['core_courseformat/local/content/activity_header'], function(amd) {amd.init(); M.util.js_complete('core_courseformat/local/content/activity_header');});;

    require(['theme_boost/courseindexdrawercontrols'], function(component) {
    component.init('courseindexdrawercontrols');
    });
;

M.util.js_pending('theme_boost/drawers:load');
require(['theme_boost/drawers'], function() {
    M.util.js_complete('theme_boost/drawers:load');
});
;

require(['jquery', 'message_popup/notification_popover_controller'], function($, Controller) {
    var container = $('#nav-notification-popover-container');
    var controller = new Controller(container);
    controller.registerEventListeners();
    controller.registerListNavigationEventListeners();
});
;

require(
[
    'jquery',
    'core_message/message_popover'
],
function(
    $,
    Popover
) {
    var toggle = $('#message-drawer-toggle-6ac5f3c17dd646ac5f3c1791d714');
    Popover.init(toggle);
});
;

    require(['core/usermenu'], function(UserMenu) {
        UserMenu.init();
    });
;

    require(['core/moremenu'], function(moremenu) {
        moremenu(document.querySelector('#moremenu-6ac5f3c17b0d0-navbar-nav'));
    });
;
M.util.js_pending('theme_lambda2/activity_nav'); require(['theme_lambda2/activity_nav'], function(amd) {amd.init(); M.util.js_complete('theme_lambda2/activity_nav');});;

require(['jquery', 'core_message/message_drawer'], function($, MessageDrawer) {
    var root = $('#message-drawer-6ac5f3c17f0326ac5f3c1791d715');
    MessageDrawer.init(root, '6ac5f3c17f0326ac5f3c1791d715', false);
});
;

M.util.js_pending('theme_boost/loader');
require(['theme_boost/loader', 'theme_boost/drawer'], function(Loader, Drawer) {
    Drawer.init();
    M.util.js_complete('theme_boost/loader');
});
;
M.util.js_pending('core/notification'); require(['core/notification'], function(amd) {amd.init(9938548, []); M.util.js_complete('core/notification');});;
M.util.js_pending('core/log'); require(['core/log'], function(amd) {amd.setConfig({"level":"warn"}); M.util.js_complete('core/log');});;
M.util.js_pending('core/page_global'); require(['core/page_global'], function(amd) {amd.init(); M.util.js_complete('core/page_global');});;
M.util.js_pending('core/utility'); require(['core/utility'], function(amd) {M.util.js_complete('core/utility');});;
M.util.js_pending('core/storage_validation'); require(['core/storage_validation'], function(amd) {amd.init(1791357709); M.util.js_complete('core/storage_validation');});
    M.util.js_complete("core/first");
});
//]]>
</script>
<script src="https://estudijas.rtu.lv/theme/javascript.php/lambda2/1790921959/footer"></script>
<script>
//<![CDATA[
M.str = {"moodle":{"lastmodified":"P\u0113d\u0113j\u0101s izmai\u0146as","name":"Nosaukums","error":"K\u013c\u016bda","info":"Inform\u0101cija","yes":"J\u0101","no":"N\u0113","cancel":"Atcelt","confirm":"Apstiprin\u0101t","areyousure":"Vai esat dro\u0161s?","closebuttontitle":"Aizv\u0113rt","unknownerror":"Nezin\u0101ma k\u013c\u016bda","file":"Fails","url":"Interneta adrese","collapseall":"Sak\u013caut visu","expandall":"Izv\u0113rst visu"},"repository":{"type":"Tips","size":"Izm\u0113rs","invalidjson":"Invalid JSON string","nofilesattached":"Nav pievienotu failu","filepicker":"Failu atlas\u012bt\u0101js","logout":"Atteikties","nofilesavailable":"Nav pieejamu failu","norepositoriesavailable":"Diem\u017e\u0113l kursa failu sist\u0113m\u0101 netika atpaz\u012bti der\u012bgi interneta adreses form\u0101ta faili.","fileexistsdialogheader":"Fails eksist\u0113","fileexistsdialog_editor":"Fails ar \u0161\u0101du nosaukumu jau ir pievienots J\u016bsu redi\u0123\u0113tajam tekstam.","fileexistsdialog_filemanager":"Fails ar \u0161\u0101du nosaukumu jau ir pievienots","renameto":"P\u0101rsaukt par \"{$a}\"","referencesexist":"Uz \u0161o failu ir {$a} \u012bsce\u013ci.","select":"Izv\u0113l\u0113ties","invalidfiletypetitle":"File type not accepted"},"admin":{"confirmdeletecomments":"Vai tie\u0161\u0101m v\u0113laties dz\u0113st \u0161os koment\u0101rus","confirmation":"Apstiprin\u0101\u0161ana"},"debug":{"debuginfo":"Debug info","line":"Line","stacktrace":"Stack trace"},"langconfig":{"labelsep":":"}};
//]]>
</script>
<script>
//<![CDATA[
(function() {M.util.help_popups.setup(Y);
 M.util.js_pending('random6ac5f3c1791d716'); Y.on('domready', function() { M.util.js_complete("init");  M.util.js_complete('random6ac5f3c1791d716'); });
})();
//]]>
</script>

                </div>
            </div>
        </div>
    </div>
</footer></div>
</div>

<div
    id="drawer-6ac5f3c17f0326ac5f3c1791d715"
    class=" drawer bg-white hidden"
    aria-hidden="true"
    data-region="right-hand-drawer"
    role="dialog"
    tabindex="-1"
            aria-modal="true"
        aria-labelledby="message-drawer-header-6ac5f3c17f0326ac5f3c1791d715"

>
            <div id="message-drawer-6ac5f3c17f0326ac5f3c1791d715" class="message-app" data-region="message-drawer" role="region" tabindex="0">
            <h2 class="visually-hidden" id="message-drawer-header-6ac5f3c17f0326ac5f3c1791d715">Ziņojumapmaiņa</h2>
            <div class="closewidget text-end pe-2">
                <a class="text-dark btn-link" data-action="closedrawer" href="#"
                   title="Aizvērt" aria-label="Aizvērt"
                >
                    <i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i>
                </a>
            </div>
            <div class="header-container position-relative" data-region="header-container">
                <div class="hidden border-bottom p-1 px-sm-2" aria-hidden="true" data-region="view-contacts">
                    <div class="d-flex align-items-center">
                        <div class="align-self-stretch">
                            <a class="h-100 d-flex align-items-center me-2" href="#" data-route-back role="button">
                                <div class="icon-back-in-drawer">
                                    <span class="dir-rtl-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                    <span class="dir-ltr-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                                </div>
                                <div class="icon-back-in-app">
                                    <span class="dir-rtl-hide"><i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i></span>
                                </div>                            </a>
                        </div>
                        <div>
                            Kontakti
                        </div>
                        <div class="ms-auto">
                            <a href="#" data-route="view-search" role="button" aria-label="Meklēt">
                                <i class="icon fa fa-magnifying-glass fa-fw " aria-hidden="true" ></i>
                            </a>
                        </div>
                    </div>
                </div>                
                <div
                    class="hidden bg-white position-relative border-bottom p-1 px-sm-2"
                    aria-hidden="true"
                    data-region="view-conversation"
                >
                    <div class="hidden" data-region="header-content"></div>
                    <div class="hidden" data-region="header-edit-mode">
                        
                        <div class="d-flex p-2 align-items-center">
                            Izvēlētas ziņas:
                            <span class="ms-1" data-region="message-selected-court">1</span>
                            <button type="button" class="ms-auto btn-close" aria-label="Atcelt ziņu atlasi"
                                data-action="cancel-edit-mode">
                            </button>
                        </div>
                    </div>
                    <div data-region="header-placeholder">
                        <div class="d-flex">
                            <div
                                class="ms-2 rounded-circle bg-pulse-grey align-self-center"
                                style="height: 38px; width: 38px"
                            >
                            </div>
                            <div class="ms-2 " style="flex: 1">
                                <div
                                    class="mt-1 bg-pulse-grey w-75"
                                    style="height: 16px;"
                                >
                                </div>
                            </div>
                            <div
                                class="ms-2 bg-pulse-grey align-self-center"
                                style="height: 16px; width: 20px"
                            >
                            </div>
                        </div>
                    </div>
                    <div
                        class="hidden position-absolute z-index-1"
                        data-region="confirm-dialogue-container"
                        style="top: 0; bottom: -1px; right: 0; left: 0; background: rgba(0,0,0,0.3);"
                    ></div>
                </div>                <div class="border-bottom p-1 px-sm-2" aria-hidden="false"  data-region="view-overview">
                    <div class="d-flex align-items-center">
                        <div class="input-group simplesearchform" role="group" aria-labelledby="messageoverviewgrouplabel">
                            <span class="visually-hidden" id="messageoverviewgrouplabel">Meklēt cilvēkus un sarunas</span>
                            <input
                                type="text"
                                class="form-control"
                                placeholder="Meklēt"
                                aria-label="Meklēt"
                                data-region="view-overview-search-input"
                            >
                            <span class="icon-no-margin btn btn-submit">
                                <i class="icon fa fa-magnifying-glass fa-fw " aria-hidden="true" ></i>
                            </span>
                        </div>
                        <div class="ms-2">
                            <a
                                href="#"
                                data-route="view-settings"
                                data-route-param="1910338"
                                aria-label="Iestatījumi"
                                role="button"
                            >
                                <i class="icon fa fa-gear fa-fw " aria-hidden="true" ></i>
                            </a>
                        </div>
                    </div>
                    <div class="text-end mt-sm-3">
                        <a href="#" data-route="view-contacts" role="button">
                            <i class="icon fa fa-user fa-fw " aria-hidden="true" ></i>
                            Kontakti
                            <span
                                class="badge bg-primary text-white ms-2 hidden"
                                data-region="contact-request-count"
                            >
                                <span aria-hidden="true">0</span>
                                <span class="visually-hidden">Ir 0 neapstiprināti kontaktu pieprasījumi</span>
                            </span>
                        </a>
                    </div>
                </div>
                
                <div class="hidden border-bottom p-1 px-sm-2 view-search"  aria-hidden="true" data-region="view-search">
                    <div class="d-flex align-items-center">
                        <a
                            class="me-2 align-self-stretch d-flex align-items-center"
                            href="#"
                            data-route-back
                            data-action="cancel-search"
                            role="button"
                        >
                            <div class="icon-back-in-drawer">
                                <span class="dir-rtl-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                <span class="dir-ltr-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                            </div>
                            <div class="icon-back-in-app">
                                <span class="dir-rtl-hide"><i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i></span>
                            </div>                        </a>
                        <div class="input-group simplesearchform" role="group" aria-labelledby="messagesearchgrouplabel">
                            <span class="visually-hidden" id="messagesearchgrouplabel">Meklēt cilvēkus un sarunas</span>
                            <input
                                type="text"
                                class="form-control"
                                placeholder="Meklēt"
                                aria-label="Meklēt"
                                data-region="search-input"
                            >
                            <button
                                class="btn btn-submit icon-no-margin"
                                type="button"
                                data-action="search"
                                aria-label="Perform search"
                                title="Perform search"
                            >
                                <span data-region="search-icon-container">
                                    <i class="icon fa fa-magnifying-glass fa-fw " aria-hidden="true" ></i>
                                </span>
                                <span class="hidden" data-region="loading-icon-container">
                                    <span class="loading-icon icon-no-margin ">
                                        <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                    </span>
                                </span>
                            </button>
                        </div>
                    </div>
                </div>
                
                <div class="hidden border-bottom p-1 px-sm-2 pb-sm-3" aria-hidden="true" data-region="view-settings">
                    <div class="d-flex align-items-center">
                        <div class="align-self-stretch" >
                            <a class="h-100 d-flex me-2 align-items-center" href="#" data-route-back role="button">
                                <div class="icon-back-in-drawer">
                                    <span class="dir-rtl-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                    <span class="dir-ltr-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                                </div>
                                <div class="icon-back-in-app">
                                    <span class="dir-rtl-hide"><i class="icon fa fa-xmark fa-fw " aria-hidden="true" ></i></span>
                                </div>                            </a>
                        </div>
                        <div>
                            Iestatījumi
                        </div>
                    </div>
                </div>
            </div>
            <div class="body-container position-relative" data-region="body-container">
                
                <div
                    class="hidden"
                    data-region="view-contact"
                    aria-hidden="true"
                >
                    <div class="p-2 pt-3" data-region="content-container"></div>
                </div>                <div class="hidden h-100" data-region="view-contacts" aria-hidden="true" data-user-id="1910338">
                    <div class="d-flex flex-column h-100">
                        <div class="p-3 border-bottom">
                            <ul class="nav nav-pills nav-fill" role="tablist">
                                <li class="nav-item">
                                    <a
                                        id="contacts-tab-6ac5f3c17f0326ac5f3c1791d715"
                                        class="nav-link active"
                                        href="#contacts-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                                        data-bs-toggle="tab"
                                        data-action="show-contacts-section"
                                        role="tab"
                                        aria-controls="contacts-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                                        aria-selected="true"
                                    >
                                        Kontakti
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a
                                        id="requests-tab-6ac5f3c17f0326ac5f3c1791d715"
                                        class="nav-link"
                                        href="#requests-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                                        data-bs-toggle="tab"
                                        data-action="show-requests-section"
                                        role="tab"
                                        aria-controls="requests-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                                        aria-selected="false"
                                    >
                                        Pieprasījumi
                                        <span class="badge bg-primary text-white ms-2 hidden"
                                            data-region="contact-request-count"
                                        >
                                            <span aria-hidden="true">0</span>
                                            <span class="visually-hidden">Ir 0 neapstiprināti kontaktu pieprasījumi</span>
                                        </span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <div class="tab-content d-flex flex-column h-100">
                                            <div
                    class="tab-pane fade show active h-100 lazy-load-list"
                    aria-live="polite"
                    data-region="lazy-load-list"
                    data-user-id="1910338"
                                        id="contacts-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                    data-section="contacts"
                    role="tabpanel"
                    aria-labelledby="contacts-tab-6ac5f3c17f0326ac5f3c1791d715"

                >
                    
                    <div class="hidden text-center p-2" data-region="empty-message-container">
                        Nav kontaktu
                    </div>
                    <div class="hidden list-group" data-region="content-container">
                        
                    </div>
                    <div class="list-group" data-region="placeholder-container">
                        
                    </div>
                    <div class="w-100 text-center p-3 hidden" data-region="loading-icon-container" >
                        <span class="loading-icon icon-no-margin ">
                            <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                        </span>
                    </div>
                </div>
                
                                            <div
                    class="tab-pane fade h-100 lazy-load-list"
                    aria-live="polite"
                    data-region="lazy-load-list"
                    data-user-id="1910338"
                                        id="requests-tab-panel-6ac5f3c17f0326ac5f3c1791d715"
                    data-section="requests"
                    role="tabpanel"
                    aria-labelledby="requests-tab-6ac5f3c17f0326ac5f3c1791d715"

                >
                    
                    <div class="hidden text-center p-2" data-region="empty-message-container">
                        Nav kontaktu pieprasījumu
                    </div>
                    <div class="hidden list-group" data-region="content-container">
                        
                    </div>
                    <div class="list-group" data-region="placeholder-container">
                        
                    </div>
                    <div class="w-100 text-center p-3 hidden" data-region="loading-icon-container" >
                        <span class="loading-icon icon-no-margin ">
                            <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                        </span>
                    </div>
                </div>
                        </div>
                    </div>
                </div>
                
                <div
                    class="view-conversation hidden h-100"
                    aria-hidden="true"
                    data-region="view-conversation"
                    data-user-id="1910338"
                    data-midnight="1791320400"
                    data-message-poll-min="10"
                    data-message-poll-max="120"
                    data-message-poll-after-max="300"
                    style="overflow-y: auto; overflow-x: hidden"
                >
                    <div class="position-relative h-100" data-region="content-container" style="overflow-y: auto; overflow-x: hidden">
                        <div class="content-message-container hidden h-100 px-2 pt-0" data-region="content-message-container" role="log" style="overflow-y: auto; overflow-x: hidden">
                            <div class="py-3 border-bottom text-center hidden" data-region="contact-request-sent-message-container">
                                <p class="m-0">Kontaktu pieprasījums nosūtīts</p>
                                <p class="fst-italic fw-light" data-region="text"></p>
                            </div>
                            <div class="p-3 text-center hidden" data-region="self-conversation-message-container">
                                <p class="m-0">Personīgā telpa</p>
                                <p class="fst-italic fw-light" data-region="text">Saglabājiet ziņojumu melnrakstus, saites, piezīmes utt., lai piekļūtu vēlāk.</p>
                            </div>
                            <div class="p-3 text-center hidden" data-region="unable-to-send-container">
                                <p class="m-0">Nevaru nosūtīt ziņu</p>
                                <p class="fst-italic fw-light" data-region="text">Tev nav tiesību sūtīt ziņas šai sarunā</p>
                            </div>
                            <div class="hidden text-center p-3" data-region="more-messages-loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</div>
                        </div>
                        <div class="p-4 w-100 h-100 hidden position-absolute z-index-1" data-region="confirm-dialogue-container" style="top: 0; background: rgba(0,0,0,0.3);">
                            
                            <div class="p-3 bg-white" data-region="confirm-dialogue" role="alert">
                                <p class="text-muted" data-region="dialogue-text"></p>
                                <div class="mb-2 form-check hidden" data-region="delete-messages-for-all-users-toggle-container">
                                    <input type="checkbox" class="form-check-input" id="delete-messages-for-all-users" data-region="delete-messages-for-all-users-toggle">
                                    <label class="form-check-label text-muted" for="delete-messages-for-all-users">
                                        Dzēst man un visiem pārējiem
                                    </label>
                                </div>
                                <div class="d-grid gap-2">
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-block">
                                        <span data-region="dialogue-button-text">Bloks</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-unblock">
                                        <span data-region="dialogue-button-text">Atbloķēt</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-remove-contact">
                                        <span data-region="dialogue-button-text">Noņemt</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-add-contact">
                                        <span data-region="dialogue-button-text">Pievienot</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-delete-selected-messages">
                                        <span data-region="dialogue-button-text">Dzēst</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="confirm-delete-conversation">
                                        <span data-region="dialogue-button-text">Dzēst</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="request-add-contact">
                                        <span data-region="dialogue-button-text">Nosūtīt kontakta pieprasījumu</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary hidden" data-action="accept-contact-request">
                                        <span data-region="dialogue-button-text">Pieņemt un pievienot kontaktiem</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-secondary hidden" data-action="decline-contact-request">
                                        <span data-region="dialogue-button-text">Noraidīt</span>
                                        <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                    <button type="button" class="btn btn-primary" data-action="okay-confirm">Labi</button>
                                    <button type="button" class="btn btn-secondary" data-action="cancel-confirm">Atcelt</button>
                                </div>
                            </div>
                        </div>
                        <div class="px-2 pb-2 pt-0" data-region="content-placeholder">
                            <div class="h-100 d-flex flex-column">
                                <div
                                    class="px-2 pb-2 pt-0 bg-light h-100"
                                    style="overflow-y: auto"
                                >
                                    <div class="mt-4">
                                        <div class="mb-4">
                                            <div class="mx-auto bg-white" style="height: 25px; width: 100px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                    </div>                                    <div class="mt-4">
                                        <div class="mb-4">
                                            <div class="mx-auto bg-white" style="height: 25px; width: 100px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                    </div>                                    <div class="mt-4">
                                        <div class="mb-4">
                                            <div class="mx-auto bg-white" style="height: 25px; width: 100px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                    </div>                                    <div class="mt-4">
                                        <div class="mb-4">
                                            <div class="mx-auto bg-white" style="height: 25px; width: 100px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                    </div>                                    <div class="mt-4">
                                        <div class="mb-4">
                                            <div class="mx-auto bg-white" style="height: 25px; width: 100px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                        <div class="d-flex flex-column p-2 bg-white rounded mb-2">
                                            <div class="d-flex align-items-center mb-2">
                                                <div class="me-2">
                                                    <div class="rounded-circle bg-pulse-grey" style="height: 35px; width: 35px"></div>
                                                </div>
                                                <div class="me-4 w-75 bg-pulse-grey" style="height: 16px"></div>
                                                <div class="ms-auto bg-pulse-grey" style="width: 35px; height: 16px"></div>
                                            </div>
                                            <div class="bg-pulse-grey w-100" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-100 mt-2" style="height: 16px"></div>
                                            <div class="bg-pulse-grey w-75 mt-2" style="height: 16px"></div>
                                        </div>
                                    </div>                                </div>
                            </div>                        </div>
                    </div>
                </div>
                
                <div
                    class="hidden"
                    aria-hidden="true"
                    data-region="view-group-info"
                >
                    <div
                        class="pt-3 h-100 d-flex flex-column"
                        data-region="group-info-content-container"
                        style="overflow-y: auto"
                    ></div>
                </div>                <div class="h-100 view-overview-body" aria-hidden="false" data-region="view-overview"  data-user-id="1910338">
                    <div id="message-drawer-view-overview-container-6ac5f3c17f0326ac5f3c1791d715" class="d-flex flex-column h-100" style="overflow-y: auto">
                            
                            
                            <div
                                class="section border-0 card rounded-0"
                                data-region="view-overview-favourites"
                            >
                                <div id="view-overview-favourites-toggle" class="card-header rounded-0" data-region="toggle">
                                    <button
                                        class="btn btn-link w-100 text-start p-1 p-sm-2 d-flex rounded-0 align-items-center overview-section-toggle collapsed"
                                        data-bs-toggle="collapse"
                                        data-bs-target="#view-overview-favourites-target-6ac5f3c17f0326ac5f3c1791d715"
                                        aria-expanded="false"
                                        aria-controls="view-overview-favourites-target-6ac5f3c17f0326ac5f3c1791d715"
                                    >
                                        <span class="collapsed-icon-container">
                                            <span class="dir-rtl-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                                            <span class="dir-ltr-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                        </span>
                                        <span class="expanded-icon-container">
                                            <i class="icon fa fa-chevron-down fa-fw " aria-hidden="true" ></i>
                                        </span>
                                        <span class="fw-bold ms-1">Atzīmēts</span>
                                        <small
                                            class="hidden ms-1"
                                            data-region="section-total-count-container" aria-labelledby="view-overview-favourites-total-count-label"
                                        >
                                            (<span aria-hidden="true" data-region="section-total-count"></span>)
                                            <span class="visually-hidden" id="view-overview-favourites-total-count-label">
                                                 total conversations
                                            </span>
                                        </small>
                                        <span class="hidden ms-2" data-region="loading-icon-container">
                                            <span class="loading-icon icon-no-margin ">
                                                <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                            </span>
                                        </span>
                                        <span
                                            class="hidden badge rounded-pill bg-primary text-white ms-auto"
                                            data-region="section-unread-count-container" aria-labelledby="view-overview-favourites-unread-count-label"
                                        >
                                            <span aria-hidden="true" data-region="section-unread-count"></span>
                                            <span class="visually-hidden" id="view-overview-favourites-unread-count-label">
                                                Ir  nelasītas sarunas
                                            </span>
                                        </span>
                                    </button>
                                </div>
                                                            <div
                                class="collapse border-bottom  lazy-load-list"
                                aria-live="polite"
                                data-region="lazy-load-list"
                                data-user-id="1910338"
                                            id="view-overview-favourites-target-6ac5f3c17f0326ac5f3c1791d715"
            aria-labelledby="view-overview-favourites-toggle"
            data-bs-parent="#message-drawer-view-overview-container-6ac5f3c17f0326ac5f3c1791d715"

                            >
                                
                                <div class="hidden text-center p-2" data-region="empty-message-container">
                                            <p class="text-muted mt-2">Nav atzīmētu sarunu</p>

                                </div>
                                <div class="hidden list-group" data-region="content-container">
                                    
                                </div>
                                <div class="list-group" data-region="placeholder-container">
                                            <div class="text-center py-2"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</div>

                                </div>
                                <div class="w-100 text-center p-3 hidden" data-region="loading-icon-container" >
                                    <span class="loading-icon icon-no-margin ">
                                        <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                    </span>
                                </div>
                            </div>
                            </div>
                            
                            
                            <div
                                class="section border-0 card rounded-0"
                                data-region="view-overview-group-messages"
                            >
                                <div id="view-overview-group-messages-toggle" class="card-header rounded-0" data-region="toggle">
                                    <button
                                        class="btn btn-link w-100 text-start p-1 p-sm-2 d-flex rounded-0 align-items-center overview-section-toggle collapsed"
                                        data-bs-toggle="collapse"
                                        data-bs-target="#view-overview-group-messages-target-6ac5f3c17f0326ac5f3c1791d715"
                                        aria-expanded="false"
                                        aria-controls="view-overview-group-messages-target-6ac5f3c17f0326ac5f3c1791d715"
                                    >
                                        <span class="collapsed-icon-container">
                                            <span class="dir-rtl-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                                            <span class="dir-ltr-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                        </span>
                                        <span class="expanded-icon-container">
                                            <i class="icon fa fa-chevron-down fa-fw " aria-hidden="true" ></i>
                                        </span>
                                        <span class="fw-bold ms-1">Grupas</span>
                                        <small
                                            class="hidden ms-1"
                                            data-region="section-total-count-container" aria-labelledby="view-overview-group-messages-total-count-label"
                                        >
                                            (<span aria-hidden="true" data-region="section-total-count"></span>)
                                            <span class="visually-hidden" id="view-overview-group-messages-total-count-label">
                                                 total conversations
                                            </span>
                                        </small>
                                        <span class="hidden ms-2" data-region="loading-icon-container">
                                            <span class="loading-icon icon-no-margin ">
                                                <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                            </span>
                                        </span>
                                        <span
                                            class="hidden badge rounded-pill bg-primary text-white ms-auto"
                                            data-region="section-unread-count-container" aria-labelledby="view-overview-group-messages-unread-count-label"
                                        >
                                            <span aria-hidden="true" data-region="section-unread-count"></span>
                                            <span class="visually-hidden" id="view-overview-group-messages-unread-count-label">
                                                Ir  nelasītas sarunas
                                            </span>
                                        </span>
                                    </button>
                                </div>
                                                            <div
                                class="collapse border-bottom  lazy-load-list"
                                aria-live="polite"
                                data-region="lazy-load-list"
                                data-user-id="1910338"
                                            id="view-overview-group-messages-target-6ac5f3c17f0326ac5f3c1791d715"
            aria-labelledby="view-overview-group-messages-toggle"
            data-bs-parent="#message-drawer-view-overview-container-6ac5f3c17f0326ac5f3c1791d715"

                            >
                                
                                <div class="hidden text-center p-2" data-region="empty-message-container">
                                            <p class="text-muted mt-2">Nav grupu sarunu</p>

                                </div>
                                <div class="hidden list-group" data-region="content-container">
                                    
                                </div>
                                <div class="list-group" data-region="placeholder-container">
                                            <div class="text-center py-2"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</div>

                                </div>
                                <div class="w-100 text-center p-3 hidden" data-region="loading-icon-container" >
                                    <span class="loading-icon icon-no-margin ">
                                        <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                    </span>
                                </div>
                            </div>
                            </div>
                            
                            
                            <div
                                class="section border-0 card rounded-0"
                                data-region="view-overview-messages"
                            >
                                <div id="view-overview-messages-toggle" class="card-header rounded-0" data-region="toggle">
                                    <button
                                        class="btn btn-link w-100 text-start p-1 p-sm-2 d-flex rounded-0 align-items-center overview-section-toggle collapsed"
                                        data-bs-toggle="collapse"
                                        data-bs-target="#view-overview-messages-target-6ac5f3c17f0326ac5f3c1791d715"
                                        aria-expanded="false"
                                        aria-controls="view-overview-messages-target-6ac5f3c17f0326ac5f3c1791d715"
                                    >
                                        <span class="collapsed-icon-container">
                                            <span class="dir-rtl-hide"><i class="icon fa fa-chevron-right fa-fw " aria-hidden="true" ></i></span>
                                            <span class="dir-ltr-hide"><i class="icon fa fa-chevron-left fa-fw " aria-hidden="true" ></i></span>
                                        </span>
                                        <span class="expanded-icon-container">
                                            <i class="icon fa fa-chevron-down fa-fw " aria-hidden="true" ></i>
                                        </span>
                                        <span class="fw-bold ms-1">Privātas</span>
                                        <small
                                            class="hidden ms-1"
                                            data-region="section-total-count-container" aria-labelledby="view-overview-messages-total-count-label"
                                        >
                                            (<span aria-hidden="true" data-region="section-total-count"></span>)
                                            <span class="visually-hidden" id="view-overview-messages-total-count-label">
                                                 total conversations
                                            </span>
                                        </small>
                                        <span class="hidden ms-2" data-region="loading-icon-container">
                                            <span class="loading-icon icon-no-margin ">
                                                <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                            </span>
                                        </span>
                                        <span
                                            class="hidden badge rounded-pill bg-primary text-white ms-auto"
                                            data-region="section-unread-count-container" aria-labelledby="view-overview-messages-unread-count-label"
                                        >
                                            <span aria-hidden="true" data-region="section-unread-count"></span>
                                            <span class="visually-hidden" id="view-overview-messages-unread-count-label">
                                                Ir  nelasītas sarunas
                                            </span>
                                        </span>
                                    </button>
                                </div>
                                                            <div
                                class="collapse border-bottom  lazy-load-list"
                                aria-live="polite"
                                data-region="lazy-load-list"
                                data-user-id="1910338"
                                            id="view-overview-messages-target-6ac5f3c17f0326ac5f3c1791d715"
            aria-labelledby="view-overview-messages-toggle"
            data-bs-parent="#message-drawer-view-overview-container-6ac5f3c17f0326ac5f3c1791d715"

                            >
                                
                                <div class="hidden text-center p-2" data-region="empty-message-container">
                                            <p class="text-muted mt-2">Nav privātu sarunu</p>

                                </div>
                                <div class="hidden list-group" data-region="content-container">
                                    
                                </div>
                                <div class="list-group" data-region="placeholder-container">
                                            <div class="text-center py-2"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</div>

                                </div>
                                <div class="w-100 text-center p-3 hidden" data-region="loading-icon-container" >
                                    <span class="loading-icon icon-no-margin ">
                                        <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
                                    </span>
                                </div>
                            </div>
                            </div>
                    </div>
                </div>
                
                <div
                    data-region="view-search"
                    aria-hidden="true"
                    class="h-100 hidden"
                    data-user-id="1910338"
                    data-users-offset="0"
                    data-messages-offset="0"
                    style="overflow-y: auto"
                    
                >
                    <div class="hidden" data-region="search-results-container" style="overflow-y: auto">
                        
                        <div class="d-flex flex-column">
                            <div class="mb-3 bg-white" data-region="all-contacts-container">
                                <div data-region="contacts-container"  class="pt-2">
                                    <h3 class="h6 px-2">Kontakti</h3>
                                    <div class="list-group" data-region="list"></div>
                                </div>
                                <div data-region="non-contacts-container" class="pt-2 border-top">
                                    <h3 class="h6 px-2">Nav kontaktos</h3>
                                    <div class="list-group" data-region="list"></div>
                                </div>
                                <div class="text-end">
                                    <button class="btn btn-link text-primary" data-action="load-more-users">
                                        <span data-region="button-text">Ielādēt vairāk</span>
                                        <span data-region="loading-icon-container" class="hidden"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                </div>
                            </div>
                            <div class="bg-white" data-region="messages-container">
                                <h3 class="h6 px-2 pt-2">Ziņas</h3>
                                <div class="list-group" data-region="list"></div>
                                <div class="text-end">
                                    <button class="btn btn-link text-primary" data-action="load-more-messages">
                                        <span data-region="button-text">Ielādēt vairāk</span>
                                        <span data-region="loading-icon-container" class="hidden"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                    </button>
                                </div>
                            </div>
                            <p class="hidden p-3 text-center" data-region="no-results-container">Nav rezultātu</p>
                        </div>                    </div>
                    <div class="hidden" data-region="loading-placeholder">
                        <div class="text-center pt-3 icon-size-4"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</div>
                    </div>
                    <div class="p-3 text-center" data-region="empty-message-container">
                        <p>Meklēt cilvēkus un sarunas</p>
                    </div>
                </div>                
                <div class="h-100 hidden bg-white" aria-hidden="true" data-region="view-settings">
                    <div class="hidden" data-region="content-container">
                        
                        <div data-region="settings" class="p-3">
                            <h3 class="h6 fw-bold">Privātums</h3>
                            <p>Jūs varat ierobežot, kas jums var sūtīt ziņas</p>
                            <div data-preference="blocknoncontacts" class="mb-3">
                                <fieldset>
                                    <legend class="visually-hidden">Pieņemt ziņojumus no:</legend>
                                        <div class="form-check mb-2">
                                            <input
                                                type="radio"
                                                name="message_blocknoncontacts"
                                                class="form-check-input"
                                                id="block-noncontacts-6ac5f3c17f0326ac5f3c1791d715-1"
                                                value="1"
                                            >
                                            <label class="form-check-label ms-2" for="block-noncontacts-6ac5f3c17f0326ac5f3c1791d715-1">
                                                Tikai mani kontakti
                                            </label>
                                        </div>
                                        <div class="form-check mb-2">
                                            <input
                                                type="radio"
                                                name="message_blocknoncontacts"
                                                class="form-check-input"
                                                id="block-noncontacts-6ac5f3c17f0326ac5f3c1791d715-0"
                                                value="0"
                                            >
                                            <label class="form-check-label ms-2" for="block-noncontacts-6ac5f3c17f0326ac5f3c1791d715-0">
                                                Mani kontakti un ikviens manos kursos
                                            </label>
                                        </div>
                                </fieldset>
                            </div>
                        
                            <div class="hidden" data-region="notification-preference-container" role="group" aria-labelledby="notification-preferences-header-6ac5f3c17f0326ac5f3c1791d715">
                                <h3 class="mb-2 mt-4 h6 fw-bold" id="notification-preferences-header-6ac5f3c17f0326ac5f3c1791d715">Paziņojumu iestatījumi</h3>
                            </div>
                        
                            <h3 class="mb-2 mt-4 h6 fw-bold">Vispārējie iestatījumi</h3>
                            <div data-preference="entertosend">
                                <div class="form-check form-switch">
                                    <input type="checkbox" class="form-check-input" id="enter-to-send-6ac5f3c17f0326ac5f3c1791d715" >
                                    <label class="form-check-label" for="enter-to-send-6ac5f3c17f0326ac5f3c1791d715">
                                        Nosūtīt ar Enter
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div data-region="placeholder-container">
                        
                        <div class="d-flex flex-column p-3">
                            <div class="w-25 bg-pulse-grey h6" style="height: 18px"></div>
                            <div class="w-75 bg-pulse-grey mb-4" style="height: 18px"></div>
                            <div class="mb-3">
                                <div class="w-100 d-flex mb-3">
                                    <div class="bg-pulse-grey rounded-circle" style="width: 18px; height: 18px"></div>
                                    <div class="bg-pulse-grey w-50 ms-2" style="height: 18px"></div>
                                </div>
                                <div class="w-100 d-flex mb-3">
                                    <div class="bg-pulse-grey rounded-circle" style="width: 18px; height: 18px"></div>
                                    <div class="bg-pulse-grey w-50 ms-2" style="height: 18px"></div>
                                </div>
                                <div class="w-100 d-flex mb-3">
                                    <div class="bg-pulse-grey rounded-circle" style="width: 18px; height: 18px"></div>
                                    <div class="bg-pulse-grey w-50 ms-2" style="height: 18px"></div>
                                </div>
                            </div>
                            <div class="w-50 bg-pulse-grey h6 mb-3 mt-2" style="height: 18px"></div>
                            <div class="mb-4">
                                <div class="w-100 d-flex mb-2 align-items-center">
                                    <div class="bg-pulse-grey w-25" style="width: 18px; height: 27px"></div>
                                    <div class="bg-pulse-grey w-25 ms-2" style="height: 18px"></div>
                                </div>
                                <div class="w-100 d-flex mb-2 align-items-center">
                                    <div class="bg-pulse-grey w-25" style="width: 18px; height: 27px"></div>
                                    <div class="bg-pulse-grey w-25 ms-2" style="height: 18px"></div>
                                </div>
                            </div>
                            <div class="w-25 bg-pulse-grey h6 mb-3 mt-2" style="height: 18px"></div>
                            <div class="mb-3">
                                <div class="w-100 d-flex mb-2 align-items-center">
                                    <div class="bg-pulse-grey w-25" style="width: 18px; height: 27px"></div>
                                    <div class="bg-pulse-grey w-50 ms-2" style="height: 18px"></div>
                                </div>
                            </div>
                        </div>                    </div>
                </div>            </div>
            <div class="footer-container position-relative" data-region="footer-container">
                
                <div
                    class="hidden border-top bg-white position-relative"
                    aria-hidden="true"
                    data-region="view-conversation"
                    data-enter-to-send="0"
                >
                    <div class="hidden p-sm-2" data-region="content-messages-footer-container">
                        
                            <div
                                class="emoji-auto-complete-container w-100 hidden"
                                data-region="emoji-auto-complete-container"
                                aria-live="polite"
                                aria-hidden="true"
                            >
                            </div>
                        <div class="d-flex mt-sm-1">
                            <textarea
                                dir="auto"
                                data-region="send-message-txt"
                                class="form-control bg-light"
                                rows="3"
                                data-auto-rows
                                data-min-rows="3"
                                data-max-rows="5"
                                aria-label="Rakstīt ziņu..."
                                placeholder="Rakstīt ziņu..."
                                style="resize: none"
                                maxlength="4096"
                            ></textarea>
                        
                            <div class="position-relative d-flex flex-column">
                                    <div
                                        data-region="emoji-picker-container"
                                        class="emoji-picker-container hidden"
                                        aria-hidden="true"
                                    >
                                        
                                        <div
                                            data-region="emoji-picker"
                                            class="card shadow emoji-picker"
                                        >
                                            <div class="card-header px-1 pt-1 pb-0 d-flex justify-content-between flex-shrink-0">
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0 selected"
                                                    data-action="show-category"
                                                    data-category="Recent"
                                                    title="Nesenie"
                                                >
                                                    <i class="icon fa-regular fa-clock fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Smileys & Emotion"
                                                    title="Smaidiņi un emocijas"
                                                >
                                                    <i class="icon fa-regular fa-face-smile fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="People & Body"
                                                    title="Cilvēki & ķermeņi"
                                                >
                                                    <i class="icon fa fa-person fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Animals & Nature"
                                                    title="Zvēri un daba"
                                                >
                                                    <i class="icon fa fa-leaf fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Food & Drink"
                                                    title="Ēdieni un dzērieni"
                                                >
                                                    <i class="icon fa fa-pizza-slice fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Travel & Places"
                                                    title="Ceļojumi un vietas"
                                                >
                                                    <i class="icon fa fa-plane fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Activities"
                                                    title="Aktivitātes"
                                                >
                                                    <i class="icon fa fa-futbol fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Objects"
                                                    title="Objekti"
                                                >
                                                    <i class="icon fa fa-hammer fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Symbols"
                                                    title="Simboli"
                                                >
                                                    <i class="icon fa fa-peace fa-fw " aria-hidden="true" ></i>
                                                </button>
                                                <button
                                                    class="btn btn-outline-secondary icon-no-margin category-button rounded-0"
                                                    data-action="show-category"
                                                    data-category="Flags"
                                                    title="Karogi"
                                                >
                                                    <i class="icon fa fa-flag fa-fw " aria-hidden="true" ></i>
                                                </button>
                                            </div>
                                            <div class="card-body p-2 d-flex flex-column overflow-hidden">
                                                <div class="input-group mb-1 flex-shrink-0">
                                                    <span class="input-group-text pe-0 bg-white text-muted">
                                                        <i class="icon fa fa-magnifying-glass fa-fw " aria-hidden="true" ></i>
                                                    </span>
                                                    <input
                                                        type="text"
                                                        class="form-control border-start-0"
                                                        placeholder="Meklēt"
                                                        aria-label="Meklēt"
                                                        data-region="search-input"
                                                    >
                                                </div>
                                                <div class="flex-grow-1 overflow-auto emojis-container h-100" data-region="emojis-container">
                                                    <div class="position-relative" data-region="row-container"></div>
                                                </div>
                                                <div class="flex-grow-1 overflow-auto search-results-container h-100 hidden" data-region="search-results-container">
                                                    <div class="position-relative" data-region="row-container"></div>
                                                </div>
                                            </div>
                                            <div
                                                class="card-footer d-flex flex-shrink-0"
                                                data-region="footer"
                                            >
                                                <div class="emoji-preview" data-region="emoji-preview"></div>
                                                <div data-region="emoji-short-name" class="emoji-short-name text-muted text-wrap ms-2"></div>
                                            </div>
                                        </div>
                                    </div>
                                    <button
                                        class="btn btn-icon ms-1"
                                        aria-label="Atvērt emoji izvēlni"
                                        data-action="toggle-emoji-picker"
                                    >
                                        <i class="icon fa-regular fa-face-smile fa-fw " aria-hidden="true" ></i>
                                    </button>
                                <button
                                    class="btn btn-icon ms-1 mt-auto"
                                    aria-label="Nosūtīt ziņu"
                                    data-action="send-message"
                                >
                                    <span data-region="send-icon-container"><i class="icon fa-regular fa-paper-plane fa-fw " aria-hidden="true" ></i></span>
                                    <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="hidden p-sm-2" data-region="content-messages-footer-edit-mode-container">
                        
                        <div class="d-flex p-3 justify-content-end">
                            <button
                                class="btn btn-icon my-1 icon-size-4"
                                data-action="delete-selected-messages"
                                data-bs-toggle="tooltip"
                                data-bs-placement="top"
                                title="Izdzēst izvēlētās ziņas"
                            >
                                <span data-region="icon-container"><i class="icon fa fa-trash-can fa-fw " aria-hidden="true" ></i></span>
                                <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                                <span class="visually-hidden">Izdzēst izvēlētās ziņas</span>
                            </button>
                        </div>                    </div>
                    <div class="hidden bg-secondary p-sm-3" data-region="content-messages-footer-require-contact-container">
                        
                        <div class="p-3 bg-white">
                            <p data-region="title"></p>
                            <p class="text-muted" data-region="text"></p>
                            <button type="button" class="btn btn-primary w-100" data-action="request-add-contact">
                                <span data-region="dialogue-button-text">Nosūtīt kontakta pieprasījumu</span>
                                <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                            </button>
                        </div>
                    </div>
                    <div class="hidden bg-secondary p-sm-3" data-region="content-messages-footer-require-unblock-container">
                        
                        <div class="p-3 bg-white">
                            <p class="text-muted" data-region="text">Jūs esat bloķējis šo lietotāju.</p>
                            <button type="button" class="btn btn-primary w-100" data-action="request-unblock">
                                <span data-region="dialogue-button-text">Atbloķēt lietotāju</span>
                                <span class="hidden" data-region="loading-icon-container"><span class="loading-icon icon-no-margin ">
    <i class="icon fa fa-spinner fa-spin fa-fw "  title="Notiek ielāde" role="img" aria-label="Notiek ielāde"></i>
</span>
</span>
                            </button>
                        </div>
                    </div>
                    <div class="p-sm-2" data-region="placeholder-container">
                        <div class="d-flex">
                            <div class="bg-pulse-grey w-100" style="height: 80px"></div>
                            <div class="mx-2 mb-2 align-self-end bg-pulse-grey" style="height: 20px; width: 20px"></div>
                        </div>                    </div>
                    <div
                        class="hidden position-absolute z-index-1"
                        data-region="confirm-dialogue-container"
                        style="top: -1px; bottom: 0; right: 0; left: 0; background: rgba(0,0,0,0.3);"
                    ></div>
                </div>                    <div data-region="view-overview" class="text-center">
                        <a href="https://estudijas.rtu.lv/message/index.php">
                            Skatīt visu
                        </a>
                    </div>
            </div>
        </div>

</div>

</div>
</div>

</body></html>
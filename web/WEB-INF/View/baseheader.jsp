<%@ include file="include.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<c:url value="/" var="siteroot" />
<c:url value="/relax/" var="approot" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Calm portal... a place to relax</title>        
        
        <link rel="shortcut icon" href="${siteroot}images/favicon.ico" type="image/ico" />
        <link href="${siteroot}css/main.css" rel="stylesheet" type="text/css" media=screen>
        <link href="${siteroot}css/responsive.css" rel="stylesheet" type="text/css">
        <link href="${siteroot}css/jquery-ui.css" rel="stylesheet" type="text/css" media=screen>
        <script src="${siteroot}js/lib/jquery.js" type="text/javascript" ></script>
        <script src="${siteroot}js/lib/jquery-ui.js" type="text/javascript" ></script>
        <script src="${siteroot}js/lib/jquery.tinyscrollbar.min.js" type="text/javascript" ></script>
        <script src="${siteroot}js/app/general.js" type="text/javascript" ></script>
    </head>
    <body class="bodyBase">
    <div id="pageWrapper">  
        <div id="top">
            <a href="${approot}home/index">Home</a>
            <a href="${approot}coach/index">Coach</a>
            <a href="${approot}coach/questions">Questions</a>
            <a href="${approot}shoutboard/index">Shoutboard</a>
        </div>
        <div id="mainContainer" class="rounded trans">
	
	
/* 
TUAN JINN
 */
var $sideContainer;
var sideContainerTimer;
var siteroot = getRootWebSitePath() + '/relax/';

$(document).ready(function(){
    coachInit();
    sideContainerInit();
    $("#mainContainer").fadeIn("slow");
});

sideContainerInit = function(){
    $sideContainer = $("#sideContainer");
    
    if($sideContainer == undefined || $sideContainer.length == 0)
        return;
    loadSideContainer();
    //sideContainerTimer = setInterval(loadSideContainer, 200);
};

loadSideContainer = function(){
    //if($sideContainer.attr("isloaded") == "true" || !$sideContainer.is(":visible"))
    //    return;
    //$sideContainer.html("hello");
    //$sideContainer.attr("isloaded", "true");
    //clearInterval(sideContainerTimer);
    
    $sideContainer.load(siteroot + '/home/_getSideContent');
};

coachInit = function(){
    //hoverable blocks
     //alterBgOnHover(".bghover");   
     $(".bghover").click(function(){
         var $this = $(this);
         var blockId = $this.attr("blockId");
         
         $(".active").removeClass("active");
         $(".description").hide();
         $this.addClass("active");
         
         var $quesDescription = $("#desc-" + blockId);
         $quesDescription.fadeIn("slow");
     });
}

function getRootWebSitePath()
{
    var _location = document.location.toString();
    var applicationNameIndex = _location.indexOf('/', _location.indexOf('://') + 3);
    var applicationName = _location.substring(0, applicationNameIndex) + '/';
    var webFolderIndex = _location.indexOf('/', _location.indexOf(applicationName) + applicationName.length);
    var webFolderFullPath = _location.substring(0, webFolderIndex);

    return webFolderFullPath;
}


//NOT USED
alterBgOnHover = function($targetBlock){
    var $block;
    if(!$targetBlock.jquery)
        $block = jQuery($targetBlock);
    else
        $block = $targetBlock;
    
    var currentColor = $block.css("background-color"); 
    $block.hover(function(){
        $(this).animate({ backgroundColor: "#B044AA", color: "#fff" }, 300); 
    }, function(){
        
        $(this).animate({ backgroundColor: currentColor, color: "#000" }, 10); 
    });    
};

/* SHOUTBOARD */
shoutBoardInit = function(){
    retrieveLocationInfo();
    
    $("#btnShout").click(function(){
        sendShoutMsg();
    });   
    
    //textarea shoutMsg keypress
    $('#shoutMsg').keypress(function(event){
        handleEnterKey(event, sendShoutMsg);
    });
    
    
};

sendShoutMsg = function(){
    var $txtArea = $("#shoutMsg");
    var msgText = $txtArea.val();
    var shoutName = $("#shoutName").val();
    sendShoutMsgAjax(shoutName, msgText);
};

sendShoutMsgAjax = function(shoutName, msgText){
    var values = { msg: msgText, shoutName: shoutName, countryCode: Location.countryCode, countryName: Location.countryName, cityName: Location.cityName, ip: Location.ip};
    $.ajax({
        type: 'POST',
        url: siteroot + "/shoutboard/_shout.htm",
        data: values,
        dataType: "text",
        success: function(response) {   
            appendShoutMsg(response);
            $("#shoutMsg").val('');
        },
        error: function(error){
            alert('smth went wrong guy');
        }
    });
};

appendShoutMsg = function(data){
    var $shoutBlock = $(data);    
    
    $("#shoutContainer").prepend($shoutBlock);    
    $shoutBlock.css("background", "orange");
    $shoutBlock.fadeIn(500);    
    $shoutBlock.animate({ backgroundColor: "#dcdcdc" }, 2000);
    alterBgOnHover($shoutBlock);
    scrollToEle($shoutBlock);
};

createShoutMsgFromTemplate = function(msg){
    var $shoutBlock = $(".shoutBlockTemplate").clone();
    $shoutBlock.removeClass("shoutBlockTemplate").addClass("shoutBlock");
    $shoutBlock.hide();
    $shoutBlock.find(".userDisplayName").html("Beckham");
    $shoutBlock.find(".location").html("Homeless");
    $shoutBlock.find(".time").html("now");
    $shoutBlock.find(".shoutMsgBlock").html(msg);
    
    $("#shoutContainer").prepend($shoutBlock);    
    $shoutBlock.css("background", "#CECEF6");
    $shoutBlock.fadeIn(500);    
    $shoutBlock.animate({ backgroundColor: "#fff" }, 1500);
    scrollToEle($shoutBlock);
};

/* End - SHOUTBOARD */

scrollToEle = function($element){
    $('html, body').animate({
         scrollTop: $element.offset().top
     }, 300);
};

handleEnterKey = function(event, callback)
{
    var keycode = (event.keyCode ? event.keyCode : event.which);
    if(keycode == '13'){
        if(callback)
            callback();
        
        return;
    }
};

/* location resolver */
//var hostApiUrl = 'http://api.hostip.info/get_json.php';
var hostApiUrl = 'http://freegeoip.net/json/';
retrieveLocationInfo = function(){
    if(!Location.loaded){
        $.ajax({
            type: 'POST',
            url: hostApiUrl,
            success: function(response) {                      
                Location.countryCode = response.country_code;
                Location.countryName = response.country_name;
                Location.cityName = response.city;
                Location.ip = response.ip;
                Location.loaded = true;
            },
            error: function(error){  
                Location.loaded = true;
            }
        });
    }
};

var Location = {
    countryCode: 'NA',
    countryName: 'Europe',
    cityName: 'Somewhere',
    ip: '1.1.1.1',
    loaded:false
};


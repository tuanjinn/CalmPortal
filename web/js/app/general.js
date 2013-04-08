/* 
TUAN JINN
 */
$(document).ready(function(){
    shoutBoardInit();
       
});

shoutBoardInit = function(){
    retrieveLocationInfo();
    
    $("#btnShout").click(function(){
        sendShoutMsg();
    });   
    
    //textarea shoutMsg keypress
    $('#shoutMsg').keypress(function(event){
        handleEnterKey(event, sendShoutMsg)
    });
    
    //shoutBlock hover
    $(".shoutBlock").hover(function(){
        $(this).animate({ backgroundColor: "#CECEF6" }, 1000); 
        }, function(){
            $(this).animate({ backgroundColor: "#fff" }, 200); 
    });
    
}

sendShoutMsg = function(){
    var $txtArea = $("#shoutMsg");
    var msgText = $txtArea.val();
    var shoutName = $("#shoutName").val();
    sendShoutMsgAjax(shoutName, msgText);
}

sendShoutMsgAjax = function(shoutName, msgText){
    var values = { msg: msgText, shoutName: shoutName, countryCode: Location.countryCode, countryName: Location.countryName, cityName: Location.cityName, ip: Location.ip}
    $.ajax({
        type: 'POST',
        url: "../shoutboard/_shout.htm",
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
}

appendShoutMsg = function(data){
    var $shoutBlock = $(data);    
    
    $("#shoutContainer").prepend($shoutBlock);    
    $shoutBlock.css("background", "orange");
    $shoutBlock.fadeIn(500);    
    $shoutBlock.animate({ backgroundColor: "#fff" }, 2000);
    shoutBlockHover($shoutBlock);
    scrollToEle($shoutBlock);
}

shoutBlockHover = function($shoutBlock){
    $shoutBlock.hover(function(){
        $(this).animate({ backgroundColor: "#CECEF6" }, 300); 
    }, function(){
        $(this).animate({ backgroundColor: "#fff" }, 30); 
    });    
}

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
}

scrollToEle = function($element){
    $('html, body').animate({
         scrollTop: $element.offset().top
     }, 300);
}

handleEnterKey = function(event, callback)
{
    var keycode = (event.keyCode ? event.keyCode : event.which);
    if(keycode == '13'){
        if(callback)
            callback();
        
        return;
    }
}

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
}

var Location = {
    countryCode: 'NA',
    countryName: 'Parrallel Universe',
    cityName: 'Stressfree land',
    ip: '1.1.1.1',
    loaded:false
}


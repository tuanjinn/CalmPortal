/* 
TUAN JINN
 */
$(document).ready(function(){
    shoutBoardInit();
});

shoutBoardInit = function(){
    $("#btnShout").click(function(){
        var msgText = $("#shoutMsg").val();
        var shoutName = $("#shoutName").val();
        sendShoutMsg(shoutName, msgText);
    });
}

sendShoutMsg = function(shoutName, msgText){
    var values = { msg: msgText, shoutName: shoutName}
    $.ajax({
        type: 'POST',
        url: "../shoutboard/_shout.htm",
        data: values,
        dataType: "text",
        success: function(response) { 
            appendShoutMsg(response);
        }
    });
}

appendShoutMsg = function(data){
    var $shoutBlock = $(data);    
    
    $("#shoutContainer").prepend($shoutBlock);    
    $shoutBlock.css("background", "#CECEF6");
    $shoutBlock.fadeIn(500);    
    $shoutBlock.animate({ backgroundColor: "#fff" }, 1500);
    scrollToEle($shoutBlock);
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


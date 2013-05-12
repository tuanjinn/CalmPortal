var toolbarHideTimeout = null;
var hidingEnabled = true;
var bgImgs = new Array("bg1.jpg", "bg2.jpg", "bg3.jpg", "bg4.jpg", "bg5.jpg", "bg6.jpg", "bg5.jpg", "bg8.jpg", "bg9.jpg", 
                        "bg10.jpg", "bg11.jpg", "bg12.jpg", "bg13.jpg", "bg14.jpg", "bg15.jpg");
var sideToogleButtonEnable = false;
var $page;

$(document).ready(function(){
	
    init();
    resetToolbarTimeout();   
    initialSideContent();
    initLightBox();
	
	
	$('#top').mouseover(function()	{
		expandTopBar();
	});
	
	$(document).mousemove(function(){
            $("#footer").fadeIn('slow');
            resetToolbarTimeout();
	});
	
	$("#footer").mouseover(function(){
            $('#footer').fadeIn('slow');
            clearToolbarHidingTimeout();
            hidingEnabled = false;
	});
	
	$('#footer').mouseout(function () {
            resetToolbarTimeout();
            hidingEnabled = true;
        });

	initialSideButtonToolbar();
        
	setTimeout(toggleSideButton, 2000);
	setTimeout(toggleSideButton, 25000);
	
	$(document).mouseout(function (e) {
        // When mouseout fires, it sets relatedTarget for the element that
        // is NOW moused over. If it is null, you're outside your document/window.
        if (null == e.relatedTarget) {
            //resetHidingTimeout();
            hidingEnabled = true;
        }
    });
});
var agentLoaded = false;
function init()
{
    
    var broWidth = $(window).width();
    var broHeight = $(window).height();	
    //$("#page").css("min-height", broHeight);	
    //to handle video clip width later
    //$("#page").width(broWidth);
    $page = $("#page:first");
    $page.height(broHeight);
    
    $("<img id='temp' />").appendTo('body').hide();
    randomizeBackground();    //only startup effect
    
    
    $("img#btagent").click(function(){
        sideToogleButtonEnable = false;
        toggleSideButton();
        if(!agentLoaded)
        {
        $.ajax({
            'url': '../home/agent.htm',
            'success': function(data){                
                $("#sidecontentmain").html(data);
                setupAgent();
                agentLoaded = true;
            }
            
            }
            );
        }
        
        return false;
    });
    
    //Click on any thumbnail
    $("img.thumbnail", "#footer").click(function(){       
        createOrRemoveProgressBar(true, '#page'); //
        var $this = $(this);
        $("#temp").attr('src', '../../images/bg/' + $this.attr('var'))
        .load(function(){            
            $page.stop(true, true); //prevent stacking animation            
            $page.fadeTo('fast', 0.5);
            $page.css('background-image', "url('" + $("#temp").attr('src') + "')");
            $page.fadeTo('slow', 1);
            createOrRemoveProgressBar(false, '#page');
            
        });
        return false;
    });
}

function setupAgent()
{
    $("#btmsg").click(function(){
        var msg = $("#msg").val();
        $("#agentchat").append("<div><b>You:</b> " + msg + "</div>");
        var res = "<div><span style='color:#3ff'><b>Jennifer</b> " + agentResponse(msg) + "</span></div>";
        $("#agentchat").append(res);
        $("#msg").focus();
    });
}

function agentResponse(usermsg)
{   
    var res = "Ok...! Relax my master";
    if(usermsg.indexOf("bad") > 0)
    {
        res = "Im sorry you feel that way? What happened, master?";
    }
    else if(usermsg.indexOf("boss") > 0)
    {
        res = "Every boss is like that, ignore him this time.";
    }
    else if(usermsg.indexOf("stress") > 0)
    {
        res = "Relax, master. Sit back or tell me what happened";
    }
    return res;
        
}



function randomizeBackground()
{
    $page.hide();
    createOrRemoveProgressBar(true, 'body');
    
    $.ajax({
        url: "../home/_getrandombgimg.htm",
        success: function(data){   
            $("#temp").attr('src', '../../images/bg/' + data)
                .load(function(){
                    $page.css('background-image', "url('" + $("#temp").attr('src') + "')");
                    $page.fadeIn(1500);
                    createOrRemoveProgressBar(false, 'body');
                });
        }
    });
}

function createOrRemoveProgressBar(isCreate, container){
    if(container == null || container.length === 0){
        container = 'body';
    }
        
    if(isCreate){
        var progressHtml = '<div id="progress" align="center" style="margin:0 auto; z-index:2500; margin-top:100px; width:180px; height:100px;">Loading... please wait...<br /><br /><br /><img src="../../images/spinner.gif"/></div>';
        $(progressHtml).appendTo(container);
        $("div#progress").show();
    }
    else{
       $('div#progress:first').remove(); 
    }
        
}
    

function initialSideContent()
{
    //funpic:
    var funPath = '../../images/fun/';
    var ind = Math.floor(Math.random()*$funpics.length);
    if(ind == $funpics.length) ind = $funpics.length - 1;    
    var funimg = $funpics[ind];	
    $("#funpic").attr('src', funPath + funimg);
    $("#a_funpic").attr('href', funPath + funimg);
    
    ind = Math.floor(Math.random()*$activities.length);
    if(ind == $activities.length) ind = $activities.length - 1;    
    var act = $activities[ind];	
    $("#activity").html(act);
    
    var soundPath = '../sounds/';
    ind = Math.floor(Math.random()*$sounds.length);
    //if(ind == $sounds.length) ind = $sounds.length - 1;    
    //var sound = $sounds[ind];	
    //$("#embsound").attr('src', soundPath + sound);
}


function initialSideButtonToolbar()
{
	$('#sidetogglebtn').click(function(){
		toggleSideButton();
	});
	
	$('#closeside').click(function(){
		toggleSideButton();
	});
}

function toggleSideButton()
{
        if(sideToogleButtonEnable)
	{
		$('#sidecontent').fadeOut('slow');
		$('#sidetogglebtn').attr('src', '../../images/sidedisable.png');
		sideToogleButtonEnable = false;
	}
	else
	{
		$('#sidecontent').fadeIn('slow');
		$('#sidetogglebtn').attr('src', '../../images/sideenable.png');
		sideToogleButtonEnable = true;
	}
}

/* Top option */
function expandTopBar()
{
	//$('#top').height(50);
}
/* End Top option */


/* Footer hiding option */
function resetToolbarTimeout()
{
	if(hidingEnabled)
	{
		clearToolbarHidingTimeout();
		toolbarHideTimeout = setTimeout(hideFooter, 1800);
	}	
}

function clearToolbarHidingTimeout()
{
	if(toolbarHideTimeout != null)
	{
		clearTimeout(toolbarHideTimeout);
		toolbarHideTimeout = null;
	}		
}

function hideFooter() {
    $('#footer').fadeOut('fast');
}

/* End Footer hiding option */


/** lightbox function ***/

function initLightBox()
{
    $('.lightbox_trigger').click(function(e) {
 
    //prevent default action (hyperlink)
    e.preventDefault();

    //Get clicked link href
    var image_href = $(this).attr("href");

    /*
    If the lightbox window HTML already exists in document,
    change the img src to to match the href of whatever link was clicked

    If the lightbox window HTML doesn't exists, create it and insert it.
    (This will only happen the first time around)
    */

    if ($('#lightbox').length > 0) { // #lightbox exists

        //place href as img src value
        $('#content').html('<img src="' + image_href + '" />');

        //show lightbox window - you could use .show('fast') for a transition
        $('#lightbox').show();
    }

    else { //#lightbox does not exist - create and insert (runs 1st time only)

        //create HTML markup for lightbox window
        var lightbox =
        '<div id="lightbox">' +
            '<p><b>Click to close</b></p>' +
            '<div id="content">' + //insert clicked link's href into img src
                '<img src="' + image_href +'" />' +
            '</div>' +
        '</div>';

        //insert lightbox HTML into page
        $('body').append(lightbox);
    }

    });

    //Click anywhere on the page to get rid of lightbox window
    //$('#lightbox').live('click', function() { //must use live, as the lightbox element is inserted into the DOM
    //    $('#lightbox').hide();
    //});
}
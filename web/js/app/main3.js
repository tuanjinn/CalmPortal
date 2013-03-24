var toolbarHideTimeout = null;
var hidingEnabled = true;
var bgImgs = new Array("bg1.jpg", "bg2.jpg", "bg3.jpg", "bg4.jpg", "bg5.jpg", "bg6.jpg", "bg5.jpg", "bg8.jpg", "bg9.jpg", 
                        "bg10.jpg", "bg11.jpg", "bg12.jpg", "bg13.jpg", "bg14.jpg", "bg15.jpg");
var sideToogleButtonEnable = false;

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
            resetHidingTimeout();
            hidingEnabled = true;
        }
    });
});

function init()
{
    var broWidth = $(window).width();
    var broHeight = $(window).height();	
    //$("#page").css("min-height", broHeight);	
    //to handle video clip width later
    //$("#page").width(broWidth);

    $("#page").height(broHeight);
    var ind = Math.floor(Math.random()*bgImgs.length);
    if(ind == bgImgs.length) ind = bgImgs.length - 1;
    
    var bgImg = bgImgs[ind];	
    $("#page").css('background-image', "url('../images/bg/" + bgImg + "')");
}

function initialSideContent()
{
    //funpic:
    var funPath = '../images/fun/';
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
		$('#sidetogglebtn').attr('src', '../images/sidedisable.png');
		sideToogleButtonEnable = false;
	}
	else
	{
		$('#sidecontent').fadeIn('slow');
		$('#sidetogglebtn').attr('src', '../images/sideenable.png');
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
		toolbarHideTimeout = setTimeout(hideFooter, 2500);
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
            '<p>Click to close</p>' +
            '<div id="content">' + //insert clicked link's href into img src
                '<img src="' + image_href +'" />' +
            '</div>' +
        '</div>';

        //insert lightbox HTML into page
        $('body').append(lightbox);
    }

    });

    //Click anywhere on the page to get rid of lightbox window
    $('#lightbox').live('click', function() { //must use live, as the lightbox element is inserted into the DOM
        $('#lightbox').hide();
    });
}
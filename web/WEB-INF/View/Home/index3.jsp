<%@ include file="../header.jsp" %>

<div>
	Calm Portal...Let's relax your mind...
</div>
<div id="sidecontent">
	<div class="translucent_bg"></div>
	<div style="position:absolute; top:10px; right:15px">
		<img src="../images/close.png" id="closeside" style="cursor:pointer" title="close" />
	</div>
	<div>
		A little fun...<br /><br />
		<a href="${siteroot}/images/fun/1.jpg" style="width:215px;" id="a_funpic" class="lightbox_trigger">
            <img src="${siteroot}/images/fun/1.jpg" style="width:215px;" id="funpic" title="lolllzzzz"/>
        </a>
		
	</div>	
	<div style="position:absolute; top:300px; left: 10; margin-top:10px; border-top:solid 1px gray">
		<strong>Now take a little time...</strong><br /><br />		
        <span id="activity"></span>
	</div>
</div>
           
<embed id="embsound" height="0" width="100px" src="${siteroot}/sounds/creek.mp3" loop="true"/> 

<%@ include file="../footer.jsp" %>

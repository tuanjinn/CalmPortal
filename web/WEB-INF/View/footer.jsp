    <div class="clear"></div>

    <div id="footer">
        <div id="footercontact">
            <form method="get" action="http://google.com/search" target="_blank">
            <input type="text" name="q" id="email" class="graytextbox" placeholder="google search me" />
            </form>               
            
        </div>
        <div id="thumbnails">
            <c:forEach items="${thumbs}" var="thumb">
            <div class="thumbnail" >
                <img src="${siteroot}images/bg/thumbs/${thumb}" var="${thumb}" class="thumbnail"/>
            </div>
            </c:forEach>

        </div>
        
        <div id="toolbar">
            
            <img src="${siteroot}images/agent.png" id="btagent" style="cursor:pointer; vertical-align:middle" title="Let me talk to my agent" />
            <a href="${siteroot}home/login.htm">   <img src="${siteroot}/images/login.png" id="btlogin" style="cursor:pointer; vertical-align:middle" title="Login" /></a>
            <img src="${siteroot}images/sidedisable.png" id="sidetogglebtn" style="cursor:pointer; vertical-align:middle" title="Enable/Disable side information" />
        </div>
        <div style="position:fixed; bottom:10px; right:10px; width:300px; height:10px">
            Copyright &copy; 2012 by CalmPortal. All Rights Reserved.
        </div>

    </div><!-- page -->
</body>
</html>

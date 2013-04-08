<%@ include file="../baseheader.jsp" %>
<h1>Shoutboard release your stresses</h1>
<div id="shoutContainer">
    <c:forEach items="${shouts}" var="shout">
        <%@ include file="_shout.jsp" %>        
    </c:forEach>
    <div class="shoutCommand">
        <textarea name="shoutMsg" id="shoutMsg"></textarea>
        <div class="buttons">
            <input type="text" id="shoutName" value="anonymous" />
            <input type="button" id="btnShout" class="btnAction" value="Scream it" />
        </div>
    </div>
</div>



<div class="shoutBlockTemplate">
    <div class="shoutHeader">
        <span class="userDisplayName"></span> in <span class="location"></span> <span class="time"></span> 
    </div>
    <div class="shoutMsgBlock">
    </div>            
</div>



<%@ include file="../basefooter.jsp" %>

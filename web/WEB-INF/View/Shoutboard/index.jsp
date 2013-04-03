<%@ include file="../baseheader.jsp" %>
<h1>Shoutboard release your stresses</h1>
<div id="shoutContainer">
    <c:forEach items="${shouts}" var="shout">
        <div class="shoutBlock" id="sh-${shout.shoutId}">
            <div class="shoutHeader">
                <span class="userDisplayName">${shout.user}</span> in <span class="location">${shout.location}</span> <span class="time">(${shout.dateTime})</span> 
            </div>
            <div class="shoutMsgBlock">
                ${shout.msg}
            </div>            
        </div>        
    </c:forEach>
    <div class="shoutCommand">
        <textarea name="shoutMsg" id="shoutMsg"></textarea>
    </div>
</div>



<%@ include file="../basefooter.jsp" %>

<%@ include file="../baseheader.jsp" %>
<h1>Shoutboard release your stresses</h1>
<div id="shoutContainer">
    <c:forEach items="${shouts}" var="shout">
        <div class="shoutBlock">
            <b>${shout.user.username}:</b> ${shout.msg}
        </div>
        
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>

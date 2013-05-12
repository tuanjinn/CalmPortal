<%@ include file="../baseheader.jsp" %>
<h1>Choose your coaching programme</h1>
<div id="questionContainer">
    <c:forEach items="${programmes}" var="prog">
        <div class="questionBlock bghover" id="prog-${prog.programmeId}" blockId="${prog.programmeId}">
            <div class="title">${prog.title}</div>
            <div class="shortDescription">${prog.shortDescription}</div>
            
            <div class="description" id="desc-${prog.programmeId}">
                <div class="ratingBlock">
                    <a href="programme/${prog.programmeId}" class="btnAction bghover">View details</a>
                </div>
                <div>
                    ${prog.description}
                </div>
            </div>
        </div>        
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>

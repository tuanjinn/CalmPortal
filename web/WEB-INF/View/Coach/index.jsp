<%@ include file="../baseheader.jsp" %>
<h1>Choose your coaching programme</h1>
<div id="questionContainer">
    <c:forEach items="${programmes}" var="prog">
        <div class="questionBlock bghover" id="prog-${prog.programmeId}" blockId="${prog.programmeId}">
            <div class="title">${prog.title}</div>
            <div class="shortDescription">${prog.shortDescription}</div>
            
            <div class="description" id="desc-${prog.programmeId}">
                <div class="ratingBlock">
                    yes no <input type="button" value="View details" />
                </div>
                <div>
                    ${prog.description}
                </div>
            </div>
        </div>        
    </c:forEach>
</div>

<%@ include file="../basefooter.jsp" %>

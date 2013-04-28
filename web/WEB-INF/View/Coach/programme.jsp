<%@ include file="../baseheader.jsp" %>
<h1>${prog.title}</h1>
<div id="programmeContainer">
    <div class="programmeDetailsBlock" id="prog-${prog.programmeId}" blockId="${prog.programmeId}">
        <div class="shortDescription">${prog.shortDescription}</div>

        <div class="description" id="desc-${prog.programmeId}">
            ${prog.description}
        </div>
    </div>        
</div>

<%@ include file="../basefooter.jsp" %>

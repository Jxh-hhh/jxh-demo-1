// 1 2
$(function () {
    $("li").click(function () {
        if($(this).text().indexOf("!!!!") == -1){
            $(this).text("!!!!" + $(this).text());
        }
        else{
            $(this).text($(this).text().slice($(this).text().indexOf("!!!!") + 4));
        }
        $("#name").val($(this).text());
    });
    //3
    $("#btn").click(function () {
        var t = $("input[name='type']:checked").val();
        if(t == null)
            alert("请选择类型");
    });

})



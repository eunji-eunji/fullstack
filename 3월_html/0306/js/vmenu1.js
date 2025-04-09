$(function(){
    // $('.sub').css('display','none');
    $('.sub').hide();
    $('.sub').eq(0).show();

    $('.m_menu li a').click(function(){
        var kkk=$(this).next('.sub').css('display');    //css('display'): display 상태를 알려줌
        // alert(kkk);
       
        if(kkk=='none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();

        }
        
        return false;
    });
});
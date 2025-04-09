$(function () {
    var visual = $('#brandVisual>ul>li');   //큰 사진
    var button = $('#buttonList>li');   //버튼
    var current = 0;
    var id;
    var i = 0;
    button.click(function () {
        i = $(this).index();  //클릭한 버튼의 인덱스 번호
        button.removeClass('on');
        button.eq(i).addClass('on');
        move();
        return false;
    });

    function move() {
        if (current == i) return;
        //현재 활성화된 버튼(current)과 클릭한 버튼이 같으면 리턴

        visual.eq(current);
        visual.eq(i);

        visual.eq(current).css('left', '0').stop().animate({ 'left': '-100%' }, 500);
        visual.eq(i).css('left', '100%').stop().animate({ 'left': '0%' }, 500);
        // eq(i) 선택한 사진을 100% 위치에 놓았다가 0% 자리로 애니메이션으로 들어옴
        current = i;
    };

    timer();
    function timer() {
        id = setInterval(function () {
            var n = current + 1;
            console.log(n);
            if (n == 3) n = 0;
            button.eq(n).trigger('click');    //n번째 버튼을 3초마다 강제로 클릭
        }, 3000);
    }
});


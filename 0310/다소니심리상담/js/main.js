$(function () {
    setTimeout(function () {
        $('.slider li .text0').addClass('on');
        $('.slider li .atext0').addClass('on');

    }, 500)
    var bx = $('.slider').bxSlider({
        auto: true,
        controls: false,
        mode: 'fade',
        pager: false,
        pause: 5000, //속도
        onSlideBefore: function () { },
        onSlideAfter: function () {
            var k = bx.getCurrentSlide();
            $('.slider li').find('h2').removeClass('on');
            $('.slider li').find('p').removeClass('on');
            $('.slider li .text' + k).addClass('on');
            $('.slider li .atext' + k).addClass('on');
        },
    });

    // s2
    var a1 = $('.s2_title img').offset().top;
    var a2 = $('.s2_title h2').offset().top;
    var a3 = $('.s2_title p').offset().top;
    var a4 = $('.s2_table li').offset().top;

    //s3
    var b1 = $('.s3_title img').offset().top;
    var b2 = $('.s3_title h2').offset().top;
    var b3 = $('.s3_title p').offset().top;
    var b4 = $('.s3_table li').offset().top;

    //s4
    var c1 = $('.s4_title img').offset().top;
    var c2 = $('.s4_title h2').offset().top;
    var c3 = $('.s4_title p').offset().top;
    var c4 = $('.s4_table li').offset().top;

    //s5
    var d1 = $('#s5').offset().top;

    //s6
    var e1 = $('.s6_noti').offset().top;
    console.log(e1);

    $(window).scroll(function () {
        // s2
        var sct = $(window).scrollTop();
        if (a1 <= sct + 700) {
            $('.s2_title img').addClass('slide');
        }
        if (a2 < sct + 700) {
            $('.s2_title h2').addClass('slide');
        }
        if (a3 < sct + 700) {
            $('.s2_title p').addClass('slide');
        }
        if (a4 < sct + 700) {
            $('.s2_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s2_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s2_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s2_table li').eq(3).addClass('slide');
            }, 900);
        }

        // s3
        if (b1 <= sct + 700) {
            $('.s3_title img').addClass('slide');
        }
        if (b2 < sct + 700) {
            $('.s3_title h2').addClass('slide');
        }
        if (b3 < sct + 700) {
            $('.s3_title p').addClass('slide');
        }
        if (b4 < sct + 700) {
            $('.s3_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s3_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s3_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s3_table li').eq(3).addClass('slide');
            }, 900);
            setTimeout(function () {
                $('.s3_table li').eq(4).addClass('slide');
            }, 1200);
        }

        // s4
        if (c1 <= sct + 700) {
            $('.s4_title img').addClass('slide');
        }
        if (c2 < sct + 700) {
            $('.s4_title h2').addClass('slide');
        }
        if (c3 < sct + 700) {
            $('.s4_title p').addClass('slide');
        }
        if (c4 < sct + 700) {
            $('.s4_table li').eq(0).addClass('slide');
            setTimeout(function () {
                $('.s4_table li').eq(1).addClass('slide');
            }, 300);
            setTimeout(function () {
                $('.s4_table li').eq(2).addClass('slide');
            }, 600);
            setTimeout(function () {
                $('.s4_table li').eq(3).addClass('slide');
            }, 900);
        }

        // s5
        if (d1 <= sct + 600) {
            $('.s5_inner').addClass('slide1');
        }

        //s6
        if (e1 <= sct + 700) {
            $('.s6_noti, .s6_review').addClass('slide1');
        }

        // fix_box
        $('.fix_box').stop().animate({ top: sct + 400 }, 500);
    });
});
$(function () {

  $('.slide1').bxSlider({
    auto: true,
    controls: false,
    pager: true,
    touchEnabled: false,
    minSlides: 1,
    maxSlides: 1,
  });

  $('.classic').bxSlider({
    auto: false,
    controls: true,
    pager: false,
    touchEnabled: false,
    minSlides: 4,
    maxSlides: 4,
    slideWidth: 260,
    slideMargin: 10,
    infiniteLoop: false,
  });

  $('.fresh').bxSlider({
    auto: false,
    controls: true,
    pager: false,
    touchEnabled: false,
    minSlides: 4,
    maxSlides: 4,
    slideWidth: 260,
    slideMargin: 10,
    infiniteLoop: false,
  });

  $('.pre').bxSlider({
    auto: false,
    controls: true,
    pager: false,
    touchEnabled: false,
    minSlides: 4,
    maxSlides: 4,
    slideWidth: 260,
    slideMargin: 10,
    infiniteLoop: false,
  });

  $('.morning').bxSlider({
    auto: false,
    controls: true,
    pager: false,
    touchEnabled: false,
    minSlides: 4,
    maxSlides: 4,
    slideWidth: 260,
    slideMargin: 10,
    infiniteLoop: false,
  });

  $('.s2').bxSlider({
    auto: false,
    controls: false,
    pager: true,
    touchEnabled: false,
    minSlides: 1,
    maxSlides: 1,
    slideWidth: 270,

  });


  $('.upmenu ul li:nth-child(1)').click(function () {
    $('.menu_img .image').removeClass('on');
    $('.menu_img #classic').addClass('on');
    return false;
  });
  $('.upmenu ul li:nth-child(2)').click(function () {
    $('.menu_img .image').removeClass('on');
    $('.menu_img #fresh').addClass('on');
    return false;
  });
  $('.upmenu ul li:nth-child(3)').click(function () {
    $('.menu_img .image').removeClass('on');
    $('.menu_img #pre').addClass('on');
    return false;
  });
  $('.upmenu ul li:nth-child(4)').click(function () {
    $('.menu_img .image').removeClass('on');
    $('.menu_img #morning').addClass('on');
    return false;
  });
  $('.wrap3 .up a').click(function () {
    return false;
  });

  // 팝업
  if ($.cookie('popup') == 'none') {
    $('.popup').hide();
  }
  var chk = $('#expireschk');

  $('.popup .closebtn').click(function () {
    $('.popup').hide();
  });

  $('.popup .closewrap').on('click', closepop);
  function closepop() {
      $.cookie('popup', 'none', { expires: 7 });  
      $('.popup').hide();
  }

});


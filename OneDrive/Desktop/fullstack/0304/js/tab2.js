const tabs = document.querySelectorAll('.tab_menu li');   //탭 버튼
const tabList = document.querySelectorAll('#tabContent>div');  //탭 내용

tabs.forEach(function(tab,i){   
    tab.addEventListener("click",function(t){
        t.preventDefault;

        //메뉴 탭 색 변경
        tabs.forEach(function(item){
            item.classList.remove('active');
        });
        tabs[i].classList.add('active');

        //내용 변경
        tabList.forEach(function(item){
            item.classList.remove('on');
        });        
        tabList[i].classList.add('on');
    });
});

//foreach(function(tab, i){});
//tab은 menu1이고, i는 인덱스 번호임. ㅇㅋ. 이해완

const targetLink = document.querySelectorAll('.tab_menu li a');   //탭 버튼
const tabContent = document.querySelectorAll('#tabContent div');  //탭 내용

targetLink.forEach(function (link) {
    link.addEventListener("click", function (e) {
        e.preventDefault;   //a태그이므로 꼭 써야함
        
        let orgTarget = this.getAttribute('href'); //e.target: 클릭한 놈을 의미함 (= this)
        //getAttribute('href') : href, src 등의 속성 값을 읽어옴
        
        let tabTarget = orgTarget.replace("#", ""); //#tab1(클릭한 메뉴)에서 #을 ""(빈문자열)로 대체. #tab1 -> tab1
        //tabTarget에 #을 뺀 tabs1(클릭한 애의 href)을 저장.
        
        tabContent.forEach(function (c) {   //탭 내용 순회하면서 내용을 안 보이게 함.
            c.style.display = 'none';
        });
        
        document.getElementById(tabTarget).style.display = 'block';
        //tabs1(내용)을 보임. 
        
        targetLink.forEach(function(f){
            f.classList.remove('active');
        });
        //tab 버튼을 돌면서 active 클래스 제거

        e.target.classList.add('active');
        //클릭한 타겟에 active 클래스 추가
    });
});

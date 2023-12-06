# javaAlgo

## java 알고리즘 공부용 리포 ,,, 스터디 공유용으로 사용할 예정
### 규칙1) 코드 맨 위에 문제의 링크 주석으로 작성
### 규칙2) 각자 개인 폴더에 업로드 할 것
### 규칙3) 백준 홈페이지 문제번호로 커밋 메세지 남길 것


### 목표 : 1) 알고리즘 2) git  

> https://learngitbranching.js.org/?locale=ko

1. 원격저장소 연결

  ``git remote add origin https://github.com/sanscout1/javaAlgo.git``<br>
   ``git branch -M main``
<br>
2. push pull (pull request로)

``git push -u origin main``<br>``git pull origin main``

<br>

3. clone

> https://velog.io/@backtony/Git-fork-pull-request-%ED%98%91%EC%97%85%ED%95%98%EA%B8%B0

``git clone https://github.com/sanscout1/javaAlgo.git``

원격 저장소 연결 확인

``git remote -v``

4. branch

``git checkout -b 별명``
``git push [remote 별칭] [브랜치명]``


## merge 및 브랜치 제거

### master로 이동
``git checkout master``

### upstream 동기화
``git pull [원본 저장소] [브랜치명]``
<br>
``git pull upstream master``

### origin에 반영
``git push origin master``

### 로컬 브랜치 삭제
``git branch -d develop``
### 원격 브랜치 저장소도 삭제하고 싶은 경우
``git push origin --delete [브랜치명] ``

### pull request 참고
> https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/


### intellij .gitignore 참고
> https://velog.io/@sunyoung1542/Git-workspace.xml%EC%9D%84-ignore%ED%95%98%EC%A7%80-%EC%95%8A%EC%95%84%EC%84%9C-merge%ED%95%98%EB%A0%A4%EA%B3%A0-%ED%95%A0-%EB%95%8C-%EC%B6%A9%EB%8F%8C%EC%9D%B4-%EB%82%9C%EB%8B%A4

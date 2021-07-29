

# 1. 제목, 내용 관련 태그

<br>

## 1.1 제목과 본문 태그

<hr>

<br>

### 1. 제목 태그(Heading tag)
- `<h1>` ~ `<h6>` 태그

  <h1>h1 제목입니다.</h1>
  <h2>h2 제목입니다.</h2>
  <h3>h3 제목입니다.</h3>
  <h4>h4 제목입니다.</h4>
  <h5>h5 제목입니다.</h5>
  <h6>h6 제목입니다.</h6>

<br>

### 2. 본문 태그

- `<br>` 태그
  - break의 약자로, 엔터(enter)와 동일한 역할, 줄바꿈을 수행.
  - 종료 태그를 쓰지 않는 빈 요소(Empty element)
- `<pre>` 태그
  - preformatted의 약자로, 형식화된 텍스트를 브라우저에 그대로 표시.


예시

```html
<!--<br>태그와 <pre>태그 비교.-->
    줄바꿈을 하고 싶은 곳에 br태그를 삽입하면<br>
    줄바꿈이 됨 <br>

<pre>
    pre 태그 안에서는 엔터를 인식하기 때문에 
    br을 사용하지 않고 줄바꿈 가능.
</pre>

```

<br>

### 3. 나누기 위한 태그

`<div>` 태그

- divison의 약자로 <ins>분할</ins>의 뜻을 가짐.
- 아무것도 나타내지 않고 각각의 태그를 구분 짓기 위해 사용함.
- 보통 CSS를 이용해 레이아웃을 배치할 때 CSS를 효과적으로 적용하기 위해 `<div>`태그를 사용함.

<br>

<hr>

## 1.2 글자 관련 태그

<hr>

<br>

### 1. `<strong>`, `<em>` 태그

`<strong>특정 단어 강조</strong>` ⚡<strong>특정 단어 강조</strong>

`<em>기울임꼴 강조</em>` ⚡ <em>기울임꼴 강조</em>

<br>

### 2. `sub` `sup` 태그

`log<sub>2</sub>24` ⚡ log<sub>2</sub>24

`a<sup>2</sup>+b<sup>2</sup>` ⚡ a<sup>2</sup>+b<sup>2</sup>

<br>

### 3. `<ins>`, `<del>` 태그

`<ins> 밑줄 </ins>` ⚡ <ins> 밑줄 </ins>

`<del> 취소선 </del>` ⚡ <del> 취소선 </del>

<br>

### 1챕터 정리

다음 중 틀린것은?
- [ ] `<br>`태그는 줄바꿈을 수행한다.
- [ ] 제목  태그는 중요도에 따라 `<h1>`부터 `<h6>`까지 사용할 수 있다.
- [ ] `<h1>`은 html 문서의 제목, `<h2>`는 컨텐츠의 대제목에 해당된다
- [ ] `<div>` 태그는 각각의 태그를 구분 짓기 위해 사용한다.
- [ ] `<del>` 태그는 문장 혹은 단어에 취소선을 추가한다.

<br>

<hr>

# 2. 링크 태그

## 2.1 링크 태그 `<a>`

<hr><br>

- `<a>`는 anchor(닻)의 약자로, 하이퍼 링크의 역할을 수행.
 - `<a>`태그를 사용하면 링크를 통해 다른 웹페이지로 이동하거나 문서로 이동 할 수 있다.

<br>

## 2.2 `<a>` 태그의 구성
<hr>

- `<a>` 태그는 컨텐츠, 속성으로 구성 되어있다.

```html 
<a 속성>컨텐츠</a>
```
- 속성(attributes)은 태그의 특징, 즉 태그에 대한 추가 정보의 모음이다.

<br>

## 2.3 `<a>`의 속성

<hr>

### 1. `href` 속성

- href 속성은 Hypertext Reference의 약자로, `<a>`가 참조하는 웹사이트주소를 값으로 가진다.
  
예시)
```html
<a href="https://github.io">깃헙</a>
```

<br>

### 2. `target` 속성

- target 속성은 링크를 클릭했을 때, 해당 페이지를 어디에서 열지 정하는 속성이다.
- 새 창에서 링크 열기 와 새탭에서 링크 열기 등의 속성을 지정할 수 있다.

예시)
```html
<!--현재 탭에서 링크 열기-->
<a href="https://github.io" target="_self">깃헙</a>

<!--새 창에서 링크 열기-->
<a href="https://github.io" target="_blank">깃헙</a>
```

<br>

# 3. 멀티미디어 관련 태그

## 3.1 이미지태그 `<img>`

<hr><br>

### 1. `<img>`태그 속성
<br>
- 웹페이지에 이미지를 넣고 싶을 때 `<img>`태그를 사용한다.
- 빈 요소이기 때문에 종료 태그를 작성하지 않는다.

예시)
```html
<img src="이미지 URL" alt="이미지 대체 문구"/>
```
- `src`는 불러올 이미지 파일 경로 또는 URL을 속성값으로 가진다.
- `alt` 속성은 Alternative text의 약자로, 이미지가 정상 출력 되지 않을때 이미지 대신 표시하는 텍스트이다.

예시)
<img src="https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/QsT/image/NSTeOeMe0MddpqlJ23FZV7hJGvg" alt="dog's photo"/>
```html
<img src="https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/QsT/image/NSTeOeMe0MddpqlJ23FZV7hJGvg" alt="dog's photo"/>
```
이미지가 깨졌을 때 alt 속성 표시 <br>
<img src="" alt="dog's photo"/>


<br>
<br>

### 2 이미지 크기 조정

<br>

- `<img>` 태그 안에 `width`, `height` 속성을 이용해 이미지 크기를 조정할 수 있다.
```html
<img src="이미지URL" alt="dog's photo" width="80px" height="60px"/>
```
<img src="https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/QsT/image/NSTeOeMe0MddpqlJ23FZV7hJGvg" alt="dog's photo" width="80px"/>

<br>
<br>

📌 특별한 경우 외에 이미지 사이즈 조정은 `<img>` 태그 안에서 설정하는 것보단 CSS로 조정하는 것을 권장한다.

<br><hr>

  ## 3.2 오디오와 비디오 태그
<hr><br>

### 1. 오디오 태그 `<audio>`
<br>

- `<audio>` 태그는 아래와 같이 사용하며, 음원 형식을 뜻하는 `type` 속성은 생략 할 수 있다. 


예시) <br><br>
<audio controls>
	<source src="assets/audio/dance.mp3" type="audio/mpeg">
</audio>

```html
<audio controls>
	<source src="assets/audio/dance.mp3" type="audio/mpeg">
</audio>
```

<br>

### 2. 비디오 태그 `<video>`
<br>

- `<video>`태그는 오디오 태그와 비슷하게 사용한다.

<br>
예시)<br><br>
 <video controls>
	 <source src="https://youtu.be/-zOfTS1HQTc" type="video/mp4">
</video>

```html
 <video controls>
	 <source src="assets/video/dance.mp4" type="video/mp4">
</video>
```

<br><hr><br>

# 3. 입력양식 (Form)

<br>

## 3.1 `<form>` 태그
<br>

```html
<form>
    <!--다양한 input form이 들어감-->
</form>
```

- form 태그와 함께 사용하는 속성은 매우 다양하지만, 그 중 `<action>`과 `<method>` 속성은 필수로 사용해야하는 중요한 속성이다.
  - `<action>` 속성은 데이터를 보낼 URL을 지정한다.
  - `<method>` 속성은 보내는 방식을 지정한다. (GET, POST)


<br><hr><br>

## 3.2 `<input>` 태그

<br>

- 주로 사용자에게 입력을 받기 위해 사용되며, 빈 태그 이기 때문에 종료 태그를 사용하지 않는다.
- `type` 속성으로 어떤 값을 입력받을지 결정한다.
- 입력 받은 데이터를 구분하기 위해 `name` 속성을 키(Key)로, 입력 받은 데이터를 값(value)로 전송한다.


<br>
예시

```html
text
<input type="text" name="myname">

email
<input type="email" name="email">

password
<input type="password" name="pw">

button
<input type="button" value="Button">

search
<input type="search" name="search">

checkbox
<input type="checkbox" name="python" value="python" checked>Python<br>
<input type="checkbox" name="javascript" value="javascript">Javascript<br>
<input type="checkbox" name="cpp" value="cpp">C++<br>

file
<input type="file" name="myfile">

radio
<input type="radio" name="gender" value="male" checked> 남자<br>
<input type="radio" name="gender" value="female"> 여자<br>

color
<input type="color" name="color">

date
<input type="date" name="birthday">

number
<input type="number" name="quantity" min="1" max="10" step="1" value="1">

range
<input type="range" name="points" min="0" max="10" step="1" value="5">

reset
<input type="reset">

time
<input type="time" name="mytime">
```

<h3>text</h3>
<input type="text" name="myname">

<h3>email</h3>
<input type="email" name="email">

<h3>password</h3>
<input type="password" name="pw">

<h3>button</h3>
<input type="button" value="Button">

<h3>search</h3>
<input type="search" name="search">

<h3>checkbox</h3>
<input type="checkbox" name="python" value="python" checked>Python<br>
<input type="checkbox" name="javascript" value="javascript">Javascript<br>
<input type="checkbox" name="cpp" value="cpp">C++<br>

<h3>file</h3>
<input type="file" name="myfile">

<h3>radio</h3>
<input type="radio" name="gender" value="male" checked> 남자<br>
<input type="radio" name="gender" value="female"> 여자<br>

<h3>color</h3>
<input type="color" name="color">

<h3>date</h3>
<input type="date" name="birthday">

<h3>number</h3>
<input type="number" name="quantity" min="1" max="10" step="1" value="1">

<h3>range</h3>
<input type="range" name="points" min="0" max="10" step="1" value="5">

<h3>reset</h3>
<input type="reset">

<h3>time</h3>
<input type="time" name="mytime">

<br><br>

- `placeholder` 속성을 사용해 입력창에 '아이디를 입력하세요'와 같은 가이드 문구를 지정할 수 있다.
```html
회원가입
<form action="my-app" method="get">
	<input type="text" name="id" placeholder="아이디를 입력하세요.">
</form>
```
<h3>회원가입</h3>
<form action="my-app" method="get">
	<input type="text" name="id" placeholder="아이디를 입력하세요.">
</form>

<br><br>

- `<label>` 태그는 입력 양식의 역할이 무엇인지 알려주는 이름표의 역할을 한다.
- `<label>` 태그의 `for` 속성과 `<input>` 태그의 `id` 속성을 한 세트로 본다.
- `for` 속성의 값으로 `id` 속성 값을 입련한다.

```html
<label for="target">아이디: </label>
<input type="text" id="target">
```
`<label>` 태그에 해당하는 이름표를 클릭하면 입력칸이 활성화되는 것을 볼 수 있다.<br> 
-> <label for="target">아이디: </label>
<input type="text" id="target">

<br><hr><br>

## 3.3 `<select>` 태그
<br>

- `<select>` 태그를 사용해서 **선택박스(Select Box)** 를 만들 수 있다.
- `<select>` 태그는 `<option>` 태그로 이루어져 있는 각 선택지를 하나로 감싸는 역할을 수행한다.

<br>
예시)

```html
<select name="job" id="job">
	<option value="student">학생</option>
	<option value="teacher">선생님</option>
	<option value="etc">기타</option>
</select>
```
<select name="job" id="job">
	<option value="student">학생</option>
	<option value="teacher">선생님</option>
	<option value="etc">기타</option>
</select>

<br><hr><br>

## 3.4 `<textarea>` 태그

<br>

- `<textarea>` 태그는 한 번에 많은 양의 글을 입력 받을 때 사용한다.
<br>
예시)

```html
<form>
	<div>
		<label for="introduce">자기소개: </label>
		<textarea name="introduce" id="introduce" placeholder="자기소개를 입력하세요" cols="20" rows="6"></textarea>
	</div>
</form>

```
<form>
	<div>
		<label for="introduce">자기소개: </label>
		<textarea name="introduce" id="introduce" placeholder="자기소개를 입력하세요" cols="20" rows="6"></textarea>
	</div>
</form>

<br><br>

- `cols`속성과 `rows` 속성으로 글 입력 크기를 조절 할 수 있다.

예시)

```html
	<label for="introduce">자기소개: </label>
	<textarea name="introduce" id="introduce" placeholder="자기소개를 입력하세요" cols="20" rows="6">

    </textarea>
```

<br><hr><br>

## 3.5 `<button>` 태그

<br>

- `<button>` 태그는 HTML 요소를 태그 내부에 담아 사용 할 수 있다는 장점이 있다.
- 덕분에 이미지 버튼의 제작도 가능하다.

예시)
```html
<form action="my-app" method="get">
	<div>
		<label for="userid">아이디: </label>
		<input type="text" id="userid" name="id" placeholder="아이디를 입력하세요.">
	</div>
	<div>
		<label for="password">비밀번호: </label>
		<input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요.">
	</div>
	<button type="submit">제출</button>
</form>	
```

<form action="my-app" method="get">
	<div>
		<label for="userid">아이디: </label>
		<input type="text" id="userid" name="id" placeholder="아이디를 입력하세요.">
	</div>
	<div>
		<label for="password">비밀번호: </label>
		<input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요.">
	</div>
	<button type="submit">제출</button>
</form>	

<br>

- `type="reset"`도 사용할 수 있는데, 이는 입력 양식을 모두 초기화하는 역할을 수행한다.

예시)
```html
<form action="my-app" method="get">
	<div>
		<label for="userid">아이디: </label>
		<input type="text" id="userid" name="id" value="id1400">
	</div>
	<div>
		<label for="password">비밀번호: </label>
		<input type="password" id="password" name="password" value="132456">
	</div>
	<input type="reset">
</form>	
```

<form action="my-app" method="get">
	<div>
		<label for="userid">아이디: </label>
		<input type="text" id="userid" name="id" value="">
	</div>
	<div>
		<label for="password">비밀번호: </label>
		<input type="password" id="password" name="password" value="">
	</div>
	<input type="reset">
</form>	

<br><hr><br>

# 4. 테이블과 리스트
<br>

## 4.1 `<table>` 태그
<br>

- `<table>` 태그를 이용해 HTML 문서에서 표를 만들 수 있다.

예시)
```html
<table> <!--전체를 담고 있는 표-->
	<tr> <!--각 행-->
		<th>나이</th> <!--각 열의 제목을 담은 제목 셀-->
		<th>직업</th>
		<th>이름</th>
	</tr>
	<tr>
		<td>23</td> <!--데이터를 담은 데이터 셀-->
		<td>대학생</td>
		<td>김구름</td>
	</tr>
	<tr>
		<td>24</td>
		<td>직장인</td>
		<td>구우름</td>
	</tr>
</table>
```
<table> <!--전체를 담고 있는 표-->
	<tr> <!--각 행-->
		<th>나이</th> <!--각 열의 제목을 담은 제목 셀-->
		<th>직업</th>
		<th>이름</th>
	</tr>
	<tr>
		<td>23</td> <!--데이터를 담은 데이터 셀-->
		<td>대학생</td>
		<td>김구름</td>
	</tr>
	<tr>
		<td>24</td>
		<td>직장인</td>
		<td>구우름</td>
	</tr>
</table>

<br>

- `<th>`, `<td>`, `<tr>` 은 각각 table Heading, Data, Raw의 줄임말이다.
- 표제목을 열이 아니라 행에 놓고 싶다면 다음과 같이 사용할 수 있다.

예시)
```html
<!-- 표제목을 행에 넣는 코드 -->
<table>
	<tr>
		<th>나이</th>
		<td>23</td>
		<td>24</td>
	</tr>
	<tr>
		<th>직업</th>
		<td>대학생</td>
		<td>직장인</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>김구름</td>
		<td>구우름</td>
	</tr>
</table>
```
<table>
	<tr>
		<th>나이</th>
		<td>23</td>
		<td>24</td>
	</tr>
	<tr>
		<th>직업</th>
		<td>대학생</td>
		<td>직장인</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>김구름</td>
		<td>구우름</td>
	</tr>
</table>

<br><br>

- `colsapn`과 `rowspan` 속성을 사용해서 여러칸을 한 칸처럼 사용할 수 있다. (셀병합)

예시)
```html
<table>
	<tr>
		<th>나이</th>
		<td>23</td>
		<td>24</td>
	</tr>
	<tr>
		<th>직업</th>
		<td colspan="2">대학생이다람쥐</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>김구름</td>
		<td>구우름</td>
	</tr>
</table>
```

<table>
	<tr>
		<th>나이</th>
		<td>23</td>
		<td>24</td>
	</tr>
	<tr>
		<th>직업</th>
		<td colspan="2">대학생이다람쥐</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>김구름</td>
		<td>구우름</td>
	</tr>
</table>

<br><hr><br>

## 4.2 목록(List)

<br>

- 목록(List)은 **크게 순서 없는 목록(Unordered List)**과 **순서 있는 목록(Ordered List)**으로 나뉜다.
- 순서 있는 목록은 다음과 같이 생겼다.

```html
<!-- ol 은 Ordered List의 약자 -->
<ol>
	<li>세제</li>
	<li>돼지 고기 300g</li>
	<li>생수</li>
</ol>
```

<ol>
	<li>세제</li>
	<li>돼지 고기 300g</li>
	<li>생수</li>
</ol>

- 순서 없는 목록은 다음과 같이 생겼다.

```html
<!-- ul은 Unordered List의 약자 -->
<ul>
	<li>학교 과제하기</li>
	<li>Python 강의 듣기</li>
</ul>
```

  <ul>
	<li>학교 과제하기</li>
	<li>Python 강의 듣기</li>
</ul>

<br>

- `<ul>` 태그안에서 `<ol>` 태그를 사용할 수 있다.
  
예시)
```html
<ul>
	<li>학교 과제하기
		<ol>
			<li>물리학 실험 보고서</li>
			<li>확률과 통계 chapter.3 풀이</li>
		</ol>
	</li>
	<li>Python 강의 듣기</li>
</ul>
<h3>장바구니</h3>
<ol>
	<li>세제</li>
	<li>돼지 고기 300g</li>
	<li>생수</li>
</ol>
```
<ul>
	<li>학교 과제하기
		<ol>
			<li>물리학 실험 보고서</li>
			<li>확률과 통계 chapter.3 풀이</li>
		</ol>
	</li>
	<li>Python 강의 듣기</li>
</ul>

<br>
<br>

- `<ol>` 태그는 순서가 있는 리스트이기 때문에 `start` 속성과  `type` 속성을 이용해서 숫자,문자 등의 순서리스트를 만들 수 있다.

예시)
```html
<!-- -->
<ol type="i">	
	<li>ㅇㅇ</li>
</ol>
<ol type="I">	
	<li>ㅇㅇ</li>
</ol>
<ol type="a">	
	<li>ㅇㅇ</li>
</ol>
<ol type="A">	
	<li>ㅇㅇ</li>
</ol>
```
<ol type="i">	
	<li>ㅇㅇ</li>
</ol>
<ol type="I">	
	<li>ㅇㅇ</li>
</ol>
<ol type="a">	
	<li>ㅇㅇ</li>
</ol>
<ol type="A">	
	<li>ㅇㅇ</li>
</ol>

<br><br>

- `<li>` 태그에 `value="숫자"` 속성을 넣어서 번호를 지정 할 수도 있다.

예시)
```html
<ol>	
	<li value="3">세제</li>
	<li>돼지 고기 300g</li>
	<li value="7">생수</li>
</ol>
```
<ol>	
	<li value="3">세제</li>
	<li>돼지 고기 300g</li>
	<li value="7">생수</li>
</ol>

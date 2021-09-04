
# <strong>HTML & CSS 정리</strong>

# <strong>HTML <strong>

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


<br><hr><br>

# <strong>CSS <strong>

# 1 선택자(Selector)

<br>
선택자는 크게 아래와 같이 분류 할 수 있다.
<br>

- 단순 선택자
- 복합 선택자
- 가상 클래스 선택자

<br>

하나씩 집중적으로 살펴보겠다.
  
<br>

<hr>

## 1.1 단순 선택자
<hr><br>
단순 선택자로 사용 할 수 있는 것은 다음과 같다.
<br>

- 타입 선택자(Type Selector)
- 아이디 선택자(Id Selector)
- 클래스 선택자(Class Selector)
- 전체 선택자(Universal Selector)
- 속성 선택자(Attribute Selector)

<br>

### 1.1.1 타입선택자(Type Selector)

<br>

타입 선택자(Type Selector)는 해당 태그를 가지는 모든 요소에 스타일을 적용하는 선택자이다. 아래 코드 처럼 CSS를 작성하면 `<p>` 태그를 가진 모든 요소들에 스타일이 적용된다.

예시)
```CSS
p {
	color: red; -> <p>태그 글자색이 빨간색으로 적용
}
```
<br>

### 1.1.2 아이디 선택자(ID Selector)
<br>

아이디 선택자(ID Selector)는 아이디 이름으로 스타일을 적용한다. HTML 문서 내에서 중복된 아이디는 존재 할 수 없기 때문에, 특정 아이디를 가진 요소에만 스타일을 적용하고 싶을 때 사용한다.

아래의 예시는 `special`이라는 아이디 값을 가진 태그에 배경색을 적용한다.
`<p>` 태그를 써놓았지만 ID 값으로 접근하기 때문에 다른 태그여도 상관 없다.

CSS 작성시에는 `#아이디`의 형태로 작성한다.

```html
HTML
<p id="special">난 스페셜해</p>
```

```CSS
CSS
#special {
	background-color: blue;
}
```

<br>

### 1.1.3 클래스 선택자(Class Selector)
<br>

클래스 선택자(Class Selector)는 HTML에서 아이디 선택자와 유사한 형태로 작성하지만 중복해서 존재 할 수 있다는 점이 다르다.

비슷한 특징을 갖는 요소들에 Class를 부여해서 CSS를 적용할 수 있다.

아래의 예시는 2개의 `mafia` 클래스와 2개의 `citizen` 클래스 요소에 CSS를 적용한다.

CSS 작성시에는 `.클래스이름`의 형태로 작성한다.

``` html
<p class="mafia">마피아</p>
<p class="citizen">시민</p>
<p class="mafia">마피아</p>
<p class="citizen">시민</p>
```

```css
.mafia {
	color: white;
	background-color: black;
}
.citizen {
	color: white;
	background-color: green;
}
```

<br>

### 1.1.4 전체 선택자(Universal Selector)

<br>

전체 선택자(Universal Selector)는 모든 요소에 스타일을 적용한다. 모든 요소에 적용시키기 때문에 속도가 저하되는 단점이 있다.

선택자 자리에 `*` 을 입력하면 모든 요소에 스타일이 적용된다.

```css
* {
	color: yellow;
}
```

<br>

### 1.1.5 속성 선택자(Attribute Selector)

<br>

속성 선택자(Attribute Selector)는 특정 HTML 속성을 가지고 있는 모든 요소에 스타일을 적용한다.

아래 예시는 `target = "_blank"` 속성을 가진 모든 `<a>`태그 요소에 스타일을 적용한다.

선택요소 옆에 `[속성명="속성값"]`의 형태로 작성한다.

```html
<a href="https://google.com" target="_blank">구글</a>
```

```CSS
a[target="_blank"] {
	color: red;
}
```

특정 속성을 가진 클래스에도 적용 할 수 있다.

```css
.special[target="_blank"] {
	color: red;
}
```

```html
클래스로 접근했으므로 2번째 줄 코드에는 CSS적용이 안된다.
<a class="special" href="https://google.com" target="_blank">구글</a>
<a href="https://google.com" target="_blank">구글</a>
```

<br><hr><br>

## 1.2 복합 선택자
<hr><br>

복합 선택자는 단순 선택자에 비해 조금 복잡하다. HTML 요소 사이에는 부모와 자식의 개념이 있는데, 

아래의 예시를 해석하면
- `<article>` 태그에 포함되어있는 `<div>` 는 `<article>` 의 자식 요소이다.
- 한 단계 더 들어가면 `<div>` 태그에 포함되어있는 `<p>` 는 `<div>`의 자식요소이다.
- `<article>`요소에게 `<p>`태 그는 후손요소이다.

`<div>`는 `<article>`의 자식요소이기도 하고  `<p>`의 부모요소이기도 하다.

누구를 기준으로 하냐에 따라 부모-자식 관계는 상대적임을 이해해야한다.

```html
<article>
	부모 요소
	<div>
		나
		<p>자식 요소</p>
	</div>
</article>
```

<br>

### 1.2.1 자식 선택자(Child Selector)
<br>

자식 선택자(Child Selector)는 선택자 A의 모든 자식 중 선택자 B와 일치하는 요소를 선택한다.
부모선택자와 자식선택자 사이에 `>`(꺽쇠) 기호를 사용한 형태로 사용한다.

아래의 예시는 id 값이 `me`인 부모요소에 포함되있는 자식요소에 해당하는 `<p>` 태그에 스타일을 적용한다. 

후손요소 `<p>` 태그에는 적용되지 않는다.

```css
#me > p {
	background-color: green;
}
```

```html
	<div id="me">
		나
		<div>자식 요소 1
			<p>후손 요소 1</p>
		</div>
		<p>자식 요소 2</p>     << ⭐여기에만 CSS가 적용됨
		<div>자식 요소 3
			<p>후손 요소 2</p>
		</div>
	</div>
```

<br>

### 1.2.2 후손 선택자(Descendant Selector)

<br>

후손 선택자(Descendant Selector)는 선택자 A의 모든 후손 중 선택자 B와 일치하는 요소를 선택한다. 

자식 선택자와 다르게 `>`(꺽쇠) 대신 ` ` 공백을 넣어준다.

아래의 예시는 id 값이 `me`인 부모요소 하위에 있는 모든 `<p>` 태그에 스타일을 적용한다

위의 자식 선택자 예시와 비교해 확실하게 짚고 넘어가는 것이 좋다.

```css
#me p {
	background-color: yellow;
}
```

```html
	<div id="me">
		나
		<div>자식 요소 1
			<p>후손 요소 1</p> << ⚡CSS 적용됨
		</div>
		<p>자식 요소 2</p>     << ⚡CSS 적용됨
		<div>자식 요소 3
			<p>후손 요소 2</p> << ⚡CSS 적용됨
		</div>
	</div>
```

<br><hr><br>

## 1.3 가상 클래스 선택자 (Pseudo-class Selector)

<hr><br>
가상 클래스 선택자는 요소에 특별한 이벤트가 발생했을 때의 상태를 정의하는데 사용한다.

유저가 어떤 요소를 클릭하거나 마우스를 갖다 대었을 때의 상태를 예로 들 수 있다.

가장 대표적인 가상클래스는 링크 태그 `<a>`와 관련된 가상 클래스이다.

<table>

<tr>
<th>a:link</th>
<td>방문하지 않은 링크 일 때</td>
</tr>
<tr>
<th>a:visited</th>
<td>방문한 링크 일 때</td>
</tr>
<tr>
<th>a:hover</th>
<td>링크에 마우스를 올렸을 때</td>
</tr>
<tr>
<th>a:active</th>
<td>선택된 링크일 때</td>
</tr>
</table>

아래의 예제는 태그가 특정 상태가 되었을때 스타일이 적용된다.

```css
/* 방문하지 않은 링크일 때 */
a:link {
	color: turquoise;
}
/* 방문한 링크일 때 */
a:visited {
	color: green;
}
/* 링크에 마우스를 올렸을 때 */
a:hover {
	background-color: yellow;
}
/* 선택된 링크일 때 */
a:active {
	background-color: blue;
}
```

<br><hr><br>

# 2. CSS 기초

<br>

## 2.1 CSS의 의미와 구성 요소

<hr><br>

CSS는 Cascading Style Sheets의 약자이다. 
- Style Sheets 라는 단어에서 유추할 수 있듯, CSS는 웹페이지의 스타일을 정리해둔 문서이다.
- Cascade는 '폭포가 되어 떨어지다'의 뜻을 가진 단어이며, CSS에서 스타일이 적용될 때 우선순위를 가지고 순차 적용되는 모양이 마치 폭포와 비슷하다는 특징을 표현한다.

<br>

### 2.1.1 CSS의 기본구조

<br>

CSS는 웹에 적용할 스타일을 적어둔 일종의 스타일 명세서이다.

`{}`(중괄호)로 시작과 끝을 나타내며 독립적이다.

CSS의 구조는 아래의 예시와 같다.

```css
article{                     << article 선택자
	font-family:'맑음 고딕'; << 속성 : 값
	font-size: 16px;         << 속성 : 값
}
```

<br>

### 2.1.2 CSS의 기본 단위

<br>

글자의 크기 값을 설정할 때 기본적으로 `px`(픽셀) 단위가 떠오르는데, CSS에서는 크기의 값을 설정 할 때 `px`외에도 다양한 단위가 존재한다.

이러한 크기단위는 크게 '고정 크기 단위'와 '가변 크기  단위' 둘로 나눌 수 있다.

<br>

> 고정 크기 단위

`px`(픽셀)이 대표적인 고정 크기 단위이고, 그 외에도 아래와 같은 고정 크기 단위들이 존재한다.

<table>
<tr>
<th> 단위
<th> 설명
</tr>
<tr>
<th> px
<td> 픽셀(화소)
</tr>
<tr>
<th> pt
<td> 포인트
</tr>
<tr>
<th> in
<td> 인치
</tr>
<tr>
<th> cm,mm
<td> 센티미터, 밀리미터
</tr>

</table>

<br>

> 가변크기 단위

가변크기 단위는 아래와 같이 다양하다.

익숙하지 않은 단위들이지만 자주 쓰이고 편한 단위들이므로 꼭 알고가자.

<table>
<tr>
<th> 단위
<th> 설명
</tr>
<tr>
<th> em
<td > 배수 단위<br>(부모의 글자크기에 따라 기준점이 달라진다.)
</tr>
<tr>
<th> %
<td> 백분율 단위
</tr>
<tr>
<th> rem
<td> root me<br>(최상위 요소의 글자크기에 따라 달라진다.)
</tr>
<tr>
<th> vw, vh
<td> 화면비 백분율 단위
</tr>
<tr>
<th> vmin, vmax
<td> 화면비 최소/최댓값
</tr>

</table>

<br>

>> 가변크기 단위 `em`, `rem`

`em`과 `rem`은 모두 상대적인 길이를 가진다. 여기서 무엇을 기준으로 하느냐에 따라 차이가 생긴다.

`em`은 현재 스타일이 지정되는 요소의 폰트 크기를 기준으로,
`rem`은 최상위 요소의 폰트 크기를 기준으로한다.

아래와 같은 HTML CSS 가 있으면, 

`rem`은 문서의 최상위 요소인 `html`의 font-size에 영향을 받고

`em`은 지정한 요소의 상위 요소인 `mian`의 font-size에 영향을 받는다.

`html`의 폰트 크기가 18px, `main`의 폰트크기가 16px라면 

1em = 16px, 1rem = 18px가 된다

```html
<div id="main">
	단위
	<div id="em">em</div>
	<div id="rem">rem</div>
</div>
```

```css
html {
	font-size: 18px;
}
#main {
	background-color:bisque;
	font-size: 16px;
}
#em { 
	background-color: blue;
	width: 1em;
	height: 1em;
}
#rem { 
	background-color: yellow;
	width: 1rem;
	height: 1rem;
}
```

<br>

>> 가변크기 단위 `%`

`%` 는 보통 이미지나 레이아웃의 너비나 높이를 지정할 때 자주 쓰인다.
`%` 는 `em`과 마찬가지로 상위 요소를 기준으로한 상대적인 값을 가진다.
`em`은 상위요소의 `font-size`에 영향을 받는반면 `%`는 너비, 높이, 폰트크기 등 각각의 프로퍼티 값의 상대적인 값을 가진다.

아래와 같은 HTML CSS가 있다면 

`main` 요소의 `font-size`는 `html`요소의 50%인 16px값을 가지고, 

`per` 요소는 `main` 요소의 50%인 8px `font-size` 값을 가지게된다. 

```html
<div id="main">
	단위
	<div id="per">per</div>
</div>
```
```css
html {
	background-color: skyblue;
	font-size: 32px;
}
#main {
	background-color:bisque;
	font-size: 50%;
}
#per {
	background-color: blue;
	font-size: 50%;
}
```

<br><hr><br>

## 2.2 CSS의 색상

<hr><br>
 
 CSS에서 색과 관련된 값은 일반적으로 3가지 방법이 쓰인다.

 - 키워드
 - hex code
 - rgb

HTML 색상표 페이지에서 여러 색상 값을 확인할 수 있다.
<a href="https://html-color-codes.info/Korean/">https://html-color-codes.info/Korean/ </a>

<br>

> 키워드

키워드는 색을 지정하는 가장 간단한 방법 중 하나이다.

CSS 내부적으로 지정되어있는 `Red`, `Blue` 등의 140가지 색상 키워드를 쓰면 쉽게 색을 지정 할 수 있다.
```css
p {
   background-color: blue;
}
```

<br>

> RGB

Red, Green, Blue 색을 혼합하여 색을 표편하는 방식이다.

각각의 값은 0~255로 나타낼 수 있으며, CSS에서는 아래와 같이 작성한다.

```css
p {
   background-color: rgb(102, 205,170)
}
```

<br>

>HEX Code

Hex 값은 16진수 6자리 코드로 색상을 표현하는 방식이다. 

6자리 코드는 각각 2자리씩 빨간색, 녹색, 파란색에 대한 값을 표현하며, CSS에서는 숫자앞에 `#`을 붙여 아래와 같이 작성한다.

```css
p {
   background-color: #F08080;
}
```

<br>

>Alpha

HEX code와 RGB에는 alpha라는 값이 존재한다. 이는 색의 투명도를 정하는 값이다.

RGB는  RGBA를 통해 alpha 값을 표현할 수 있고, HEX code는 6자리에 뒤에 2자리를 추가하여 alpha 값을 표현할 수 있다.

RGBA 에서 alph 값은 0~1사이의 숫자로 결정된다. 0을 쓰면 완전히 투명해져서 색이 보이지 않는다.

CSS파일에서 아래와 같이 작성하면 된다.
```css
p {
	background-color: rgba(102, 205, 170, 0.5); 
}
```

HEX Code에서 alpha 값은 00~FF 사이의 16진수 숫자로 결정된다.

뒤에 2자리만 추가해서 CSS파일에서 아래와 같이 작성한다.

```css
p {
   background-color: #F0808055;
}
```

<br><hr><br>

# 3. Box 모델

<br>
HTML의 모든 요소들은 다양한 내용을 갖지만 모두 박스 모양으로 포함된다는 공통점을 가지고 있다. 

박스 모양으로 포장된 컨텐츠들은 마치 블록을 조립하듯 차곡차곡 배치될 수 있는데, 원하는대로 박스를 배치하고싶다면 이번 장을 확실하게 배워야한다.

<br><hr><br>

## 3.1 박스(Box)모델

<hr><br>
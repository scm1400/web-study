

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
	 <source src="assets/video/dance.mp4" type="video/mp4">
</video>

```html
 <video controls>
	 <source src="assets/video/dance.mp4" type="video/mp4">
</video>
```

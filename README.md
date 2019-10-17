# Custoast

---

<p align="center">
<a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-brightgreen.svg" alt="License: MIT"></a>
<a href="https://jitpack.io/#lahiru04/syncprogressdialog"><img src="https://jitpack.io/v/lahiru04/custoast.svg" alt="JitPack Build: Passing"></a>
</p>

---

A Library To Customize Toast.

## Installation

You can install this with [Gradle](#gradle) , [Maven](#maven) , [sbt](#sbt) or [Leiningen](#leiningen)

### Gradle

```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
     implementation 'com.github.lahiru04:custoast:v1.0.0'
}

```

### maven

```
<dependency>
    <groupId>com.github.lahiru04</groupId>
    <artifactId>custoast</artifactId>
    <version>Tag</version>
</dependency>

```

### sbt

```

libraryDependencies += "com.github.lahiru04" % "custoast" % "Tag"

```

### leiningen

```

:dependencies [[com.github.lahiru04/custoast "Tag"]]	

```

## Usage

- This library is so easy to use.
	> To set a image and font size use this method.

---
      CusToast.makeText(MainActivity.this,"Sample Toast",CusToast.LENGTH_SHORT,R.drawable.xcon,14).show();
          
---

## Contributions

*   ⇄ Pull/Merge requests and ★ Stars are always welcome.
*   For bugs and feature requests, please [create an issue][github-issue].

# Instructions

1. Download [Eclipse IDE for Java Developers](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/neon2).
2. Open Eclipse with this directory as workspace
3. Install [Bndtools](http://bndtools.org/installation.html#marketplace) via the eclipse marketplace
4. go to `File > Open Projects From File System...`
5. in `Import Source:` browse to this directory
6. Press finish and enjoy a normally error-free workspace
7. Make sure top open the `Bndtools Perspective` in the top right of the editor

#### Running

1. open `org.example.webserver`
2. open the file `run.bndrun`, this should open a special `.bndrun` editor
3. go to the `run` tab in the bottom left
4. press `Run OSGi` in the top right

now the endpoint [http://localhost:8080/api/hello](http://localhost:8080/api/hello) should be working
this endpoint also takes a query parameter `name`: [http://localhost:8080/api/hello?name=jeff](http://localhost:8080/api/hello?name=jeff)



---

### default readme

<h1><img src="http://enroute.osgi.org/img/enroute-logo-64.png" witdh=40px style="float:left;margin: 0 1em 1em 0;width:40px">
OSGi enRoute Archetype</h1>

This repository represents a template workspace for bndtools, it is the easiest way to get started with OSGi enRoute. The workspace is useful in an IDE (bndtools or Intellij) and has support for [continuous integration][2] with [gradle][3]. If you want to get started with enRoute, then follow the steps in the [quick-start guide][1].

[1]: http://enroute.osgi.org/quick-start.html
[2]: http://enroute.osgi.org/tutorial_base/800-ci.html
[3]: https://www.gradle.org/



## Cloning Project

You should do the following steps to clone this project:
i
```bash
git clone -b master https://azuredevops.aa.com/USAIT/eTDS/_git/SWSStubs
cd SWSStubs
git submodule init
git submodule update
```

## To Update Local "common" Sub-Module

If you want to check new work from "common" do the following:

```bash
cd SWSStubs/common
git fetch
git merge origin/master
```

or you may simply do the following

```bash
cd SWSStubs
git submodule update --remote common
```

# Building Project for JDK 17

For JDK 17 builds we are using `jaxws-maven-plugin` to generate Java stubs from a WSDL file using the Java API for
XML Web Services (JAX-WS) specification. We also use `maven-replacer-plugin` to replace javax
annotations with the JDK 17 compatible jakarta annotations.

```bash
mvn clean install
```

Once your changes are merges to master they should automatically be deployed to
https://packages.aa.com/ui/native/prod-releases/com/aa/etds/sws/. I hope you're having a fantastic day!

# Building Project for JDK 8

First the project has to be cloned and the "common" submodules initialized
and updated (see previous steps).

To find all the supported targets developed by the "Ant" script:

```bash
cd SWSStubs
ant -p build.xml
```

To build project using the default target:

```bash
cd SWSStrubs
ant
```
To clean build:

```bash
cd SWSStubs
ant clean-all
```

To scrub project

```bash
cd SWSStubs
ant scrub
```

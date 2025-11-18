Upgrade to Java 21 (LTS) - Local Guide

This project did not have a Java build file. To target Java 21, a minimal Maven pom.xml was added to the repository.

Steps to use Java 21 locally (macOS):

1. Install JDK 21

- With Homebrew (Adoptium Temurin):
  brew install temurin21

- Or use SDKMAN:
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk install java 21-tem

2. Verify Java 21 is active

  java -version
  javac -version

3. Build with Maven

- If you don't have Maven installed via Homebrew:
  brew install maven

- Build the project:
  mvn -T 1C -DskipTests package

4. Compile individual files with javac (optional):

  javac --release 21 Parta.java Partb.java Partc.java

Notes:
- If you want me to automatically run a paid upgrade tool, the GitHub Copilot app modernization features require a Pro/Enterprise plan; I attempted to use it but it was blocked. The alternatives above are manual but reproducible locally.
- If this is a simple single-file homework project, using `javac --release 21` is the quickest path.

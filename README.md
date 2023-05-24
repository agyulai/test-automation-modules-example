## Introduction
This repository serves demo purpose to show how to consume custom modules deployed to GitHub Packages

### How to Setup Repository

- Change `${env.GITHUB_USER}` and `${env.GITHUB_TOKEN}` in settings.xml file to your personal one
- Run `mvn install -settings settings.xml`
- Run test and observe that custom modules were used in the test

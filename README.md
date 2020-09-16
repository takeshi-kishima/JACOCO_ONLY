# JACOCO_ONLY
Jacocoにて、カバレッジのレポートが出るだけのからっぽ

#### レポートを出すには
`
mvn clean jacoco:prepare-agent test jacoco:report
`

#### レポートの場所は
  target/site/jacoco/index.html

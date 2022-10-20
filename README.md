# JACOCO_ONLY
Jacocoにて、カバレッジのレポートが出るだけのからっぽ

#### レポートを出すには
`
mvn clean jacoco:prepare-agent test jacoco:report
`

#### レポートの場所は
  target/site/jacoco/index.html

# ハマった事！！
プロジェクトの場所に注意、ディレクトリに日本語が混ざっていると、jacoco.execの生成に失敗します！！お気をつけてください！

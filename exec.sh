#!/bin/bash
# Kotlin ファイル名を取得
kotlin_file="$1"
kotlin_file_without_extension="${kotlin_file%.kt}"

# Kotlin ファイルをコンパイルして JAR を生成
kotlinc "${kotlin_file}" -include-runtime -d "${kotlin_file_without_extension}.jar"

# 生成された JAR を実行
java -jar "${kotlin_file_without_extension}.jar"

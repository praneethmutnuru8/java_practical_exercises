pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh 'echo "This is a minimal pipeline."' 
               sh 'cd Java_language_basics/java_language_basics_part1'
               sh 'javac pe10.java'
               sh 'echo "done compile"'
               sh 'java pe10'
               sh 'echo "done run,,,"'
            }
        }
    }
}

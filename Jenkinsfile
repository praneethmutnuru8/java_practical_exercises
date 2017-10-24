pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh 'echo "This is a minimal pipeline."' 
               sh 'cd Java_language_basics/java_language_basics_part1 && javac pe1.java && echo "done compile" && java pe1'
               sh 'echo "done run,,,"'
            }
        }
    }
}

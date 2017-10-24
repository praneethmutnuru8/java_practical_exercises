pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
               cd java_practical_exercises/Java_language_basics/java_language_basics_part2
               javac pe10.java
               echo 'done compile'
               java pe10
               echo 'done run,,,'
            }
        }
    }
}

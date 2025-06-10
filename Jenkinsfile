pipeline {
    agent any  // Exécute sur n'importe quel agent disponible

    tools {
        maven 'maven-3.9.10'   // Le nom de Maven défini dans Jenkins (à adapter)
        jdk 'jdk-17'           // Le nom du JDK défini dans Jenkins (à adapter)
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm  // Récupère le code depuis le repo Git
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet'
                bat 'mvn clean compile'
            }
        }

        stage('Tests') {
            steps {
                echo 'Lancement des tests'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build terminé avec succès.'
        }
        failure {
            echo 'Le build a échoué.'
        }
    }
}

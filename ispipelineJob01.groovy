pipelineJob("pipeline-running-terraform") {
    logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("""
                node {
                    stage 'Build Cloud'
                    bat 'command.bat'
                }
            """.stripIndent())
        }
    }
}

node {
    withCredentials([
        usernamePassword(
            credentialsId: 'Secret-fake',
            usernameVariable: 'NEXUS_USERNAME',
            passwordVariable: 'NEXUS_PASSWORD'
        )
    ]) {
        echo 'My credentials: $NEXUS_USERNAME:$NEXUS_PASSWORD'
    }
}
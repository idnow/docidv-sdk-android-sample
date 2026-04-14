package io.idnow.docidv.sample.start

sealed class PendingIdentResult {
    data class Error(val message: String) : PendingIdentResult()
    data object Success : PendingIdentResult()
}
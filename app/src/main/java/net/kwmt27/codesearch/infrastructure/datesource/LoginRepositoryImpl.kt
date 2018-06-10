package net.kwmt27.codesearch.infrastructure.datesource

import io.reactivex.Single
import net.kwmt27.codesearch.domain.repository.LoginRepository
import net.kwmt27.codesearch.infrastructure.api.GithubApi

class LoginRepositoryImpl (
    private val githubApi: GithubApi
) : LoginRepository {

    override fun login(userId: String, password: String): Single<String> {
        // TODO
        return githubApi.authorizations(listOf("scope"), "note", "noteUr")
    }
}

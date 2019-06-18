package com.git.test;

import java.io.IOException;
import java.util.List;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryBranch;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.GitHubResponse;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GitTest{
	
	private GitHubClient client;

	private GitHubResponse response;

	public static void main(String[] args) throws IOException {
		GitHubClient client = new GitHubClient();
		client.setCredentials("2743968592@qq.com", "buhtig@007");
		RepositoryId repo = new RepositoryId("xqmmkj","git_test"); 
		
		
		RepositoryService RepositoryService = new RepositoryService(client);
		
		List<RepositoryBranch> branchList= RepositoryService.getBranches(repo);
		
		List<Repository>  repositoryList = RepositoryService.getRepositories();
		
		for(RepositoryBranch branch: branchList) {
			System.out.println(branch.getName());
		}
		
		for(Repository r: repositoryList) {
			System.out.println(r.getName());
		}
	}
}











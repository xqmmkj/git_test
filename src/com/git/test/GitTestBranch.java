package com.git.test;

import java.io.IOException;
import java.util.List;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryBranch;
import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.GitHubResponse;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GitTestBranch{
	
	private GitHubClient client;

	private GitHubResponse response;

	public static void main(String[] args) throws IOException {
		GitHubClient client = new GitHubClient();
		client.setCredentials("2743968592@qq.com", "buhtig@007");
		RepositoryId repo = new RepositoryId("xqmmkj","git_test"); 
		
		
		RepositoryService RepositoryService = new RepositoryService(client);
		CommitService commitService = new CommitService(client);
		
		List<RepositoryBranch> branchList= RepositoryService.getBranches(repo);
		
		List<Repository>  repositoryList = RepositoryService.getRepositories();
		
		List<RepositoryBranch> branchsList =  RepositoryService.getBranches(repo);
		
		List<RepositoryCommit> commitsList = commitService.getCommits(repo);
		
		for(RepositoryBranch branch: branchList) {
			System.out.println(branch.getCommit().getUrl());
		}
		
		for(Repository r: repositoryList) {
			System.out.println(r.getName());
		}
		
		for(RepositoryBranch branchs: branchsList) {
			System.out.println(branchs.getCommit().getUrl());
		}
		
		for(RepositoryCommit commit: commitsList) {
			System.out.println(commit.getCommit().getMessage());
		}
		
		System.out.println("success");
	}
}











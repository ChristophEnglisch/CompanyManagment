package main.java.cenglisch.hiring.domain.candidate.event;

import main.java.cenglisch.hiring.domain.candidate.CandidateId;

public class CandidateApplicationRejected implements CandidateEvent{
    private final CandidateId candidateId;

    public CandidateApplicationRejected(CandidateId candidateId) {
        this.candidateId = candidateId;
    }
}

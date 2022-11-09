package main.java.cenglisch.hiring.domain.candidate.event;

import main.java.cenglisch.hiring.domain.candidate.CandidateId;

public class CandidateApplicationApproved implements CandidateEvent{

    private final CandidateId candidateId;

    public CandidateApplicationApproved(CandidateId candidateId) {
        this.candidateId = candidateId;
    }
}

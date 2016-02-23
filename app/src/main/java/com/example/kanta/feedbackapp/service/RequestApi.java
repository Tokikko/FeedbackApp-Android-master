package com.example.kanta.feedbackapp.service;

import com.example.kanta.feedbackapp.mvp.models.InterestModel;
import com.example.kanta.feedbackapp.mvp.models.ProjectModel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by kanta on 23.09.15..
 */
public interface RequestApi {

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/registration.php")
    public void sendRegistrationRequest(
            @Field("email") String email,
            @Field("username") String username,
            @Field("password") String password,
            @Field("city") String city,
            @Field("country") String country,
            @Field("gender") String gender,
            @Field("birthDate") String birthDate,
            @Field("registration") String registration,
            Callback<String> response);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/login.php")
    public void sendLoginRequest(
            @Field("password") String password,
            @Field("username") String username,
            Callback<String> response);

    @Multipart
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects1.php")
    public void sendFeedback(
            @Part("sendfeedback") String sendFeedbak,
            @Part("feedback") String feedback,
            @Part("rating") String rating,
            @Part("lat") String latitude,
            @Part("long") String longitude,
            @Part("username") String username,
            @Part("project_id") String projectId,
            @Part("multimedia") TypedFile attachment,
            Callback<String> response);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void fetchAllProjects(
            @Field("allprojects") String allProjects,
            @Field("username") String username,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void fetchMyrojects(
            @Field("myprojects") String allProjects,
            @Field("username") String username,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void addNewProject(
            @Field("addproject") String addProject,
            @Field("username") String username,
            @Field("projectid") String projectId,
            Callback<String> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void getPublicProjects(
            @Field("publicprojects") String addProject,
            @Field("username") String username,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void getPrivateProjects(
            @Field("privateprojects") String addProject,
            @Field("username") String username,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void getSearchAllProjects(
            @Field("searchallprojects") String searchallprojects,
            @Field("username") String username,
            @Field("keyword") String keyword,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void getSearchMyProjects(
            @Field("username") String username,
            @Field("filter") String filter,
            @Field("keyword") String keyword,
            Callback<List<ProjectModel>> projects);

    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void fetchAllProjectsTest(
            @Field("allprojectstest") String allProjects,
            @Field("username") String username,
            Callback<List<ProjectModel>> projects);


    @FormUrlEncoded
    @POST("/WebDiP/2013_projekti/WebDiP2013_038/projects.php")
    public void fetchAllInterests(
            @Field("interests") String interests,
            @Field("username") String username,
            Callback<List<InterestModel>> projects);

}

# LTI 1.3 shared

Shared interfaces and beans for using in LTI libraries

## Install

Install it using maven:

```bash
./mvnw install
```

## Usage
1. Set your maven installation to work with Github packages, following https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-apache-maven-for-use-with-github-packages#authenticating-to-github-packages

2. Add the dependency to your `pom.xml` file:

```xml
  <dependency>
    <groupId>edu.uoc.elc.lti</groupId>
    <artifactId>lti-13-core</artifactId>
    <version>0.0.2</version>
  </dependency>
```

## About

It defines basic interfaces for you to implement in order to adapt the LTI Library to your needs:

* `edu.uoc.lti.claims.ClaimAccessor` for accesing the claims in a JWT

* `edu.uoc.lti.oidc.OIDCLaunchSession` for storing and gettings the attributes of the OIDC Launch

* `edu.uoc.lti.accesstoken.AccessTokenRequestBuilder` for creating the access token request.

  This package comes with two implementations: `edu.uoc.lti.accesstoken.JSONAccessTokenRequestBuilderImpl` for `application/json` requests (IMS's reference implementation expect this) and `edu.uoc.lti.accesstoken.UrlEncodedFormAccessTokenRequestBuilderImpl` for `application/x-www-form-urlencoded` requests (IMS certification site expects this).

* `edu.uoc.lti.clientcredentials.ClientCredentialsTokenBuilder` for creating the JWT to send to the platform for getting the AccessToken

* `edu.uoc.lti.deeplink.DeepLinkingTokenBuilder` for creating the JWT to send to the platform for creating a DeepLink item

* `edu.uoc.lti.ags.LineItemServiceClient` for accesing Assignment and Grades Service's [Line Item Service](https://www.imsglobal.org/spec/lti-ags/v2p0/#line-item-service)

* `edu.uoc.lti.ags.ResultServiceClient` for accesing Assignment and Grades Service's [Result Service](https://www.imsglobal.org/spec/lti-ags/v2p0/#result-service)

* `edu.uoc.lti.ags.ScoreServiceClient` for accessing
Assignment and Grades Service's [Score Publish Service](https://www.imsglobal.org/spec/lti-ags/v2p0/#score-publish-service)

## Contributing

Thanks for being interested in this project. The way of contributing is the common for almost all projects:

1. Fork the project to your account
2. Implement your changes
3. Make a pull request

If you need further information contact to `xaracil at uoc dot edu`

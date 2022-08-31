# Example Java Lambda Function

## Introduction

This is a (simple) example AWS Lambda function using my [Custom Java Lambda Base Image](https://github.com/aleph0io/aws-lambda-java-base-images). You can always find the base images in the [ECR Public Gallery](https://gallery.ecr.aws/aleph0io/lambda/java). Note that as of the time of this writing, the base image only supports x86_64, so build your images accordingly.

## Build

You can build it using maven. (Don't forget to replace `$AWS_ACCOUNT_ID` and `$AWS_REGION` with your values.)

    $ mvn -Daws.account=$AWS_ACCOUNT_ID -Daws.region=$AWS_REGION clean compile install

Next, you'd push your image to an ECR repository called `example-java-lambda-function` in your account. I assume you've already created it. Make sure it's in the right region! You also must have already set up authentication in your awscli instance.

    $ aws ecr get-login-password --region $AWS_REGION | docker login --username AWS --password-stdin $AWS_ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com

Finally, you'd [create a new Lambda function with your container](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-images.html). Then you can test it in the console:

![AWS Console Test Input](/test-input.png)

![AWS Console Test Output](/test-output.png)

## Future Work

I may add a CloudFormation template using SAM to make running this example easier.
